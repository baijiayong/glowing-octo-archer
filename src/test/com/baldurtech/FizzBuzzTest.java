package com.baldurtech;

public class FizzBuzzTest {
    public static Boolean testResult = true;
    FizzBuzz fizzBuzz = new FizzBuzz();
    public static void main(String args[]) {
        
        new FizzBuzzTest().test_1_should_be_1();
        new FizzBuzzTest().test_3_should_be_Fizz();
        new FizzBuzzTest().test_5_should_be_Buzz();
        
        outputTestResult();
    }
    public void test_1_should_be_1() {
        assertEquals("1", fizzBuzz.say(1));
    }
    
    public void test_3_should_be_Fizz() {
        assertEquals("Fizz", fizzBuzz.say(3));
    }
    
    public void test_5_should_be_Buzz() {
        assertEquals("Buzz", fizzBuzz.say(5));
    }
    public void assertEquals(String exceptedResult,String actualResult) {
        if(! exceptedResult.equals(actualResult)) {
            testResult = false;
            System.out.println("Excepted " + exceptedResult + " But " + actualResult);
        }
    }
    public static void outputTestResult() {
        if(testResult){
            System.out.println("Test Success!");
        } else {
            System.out.println("Test Failed!");
        }
    }
}
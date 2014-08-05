package com.baldurtech;

public class FizzBuzzTest {
    public static Boolean testResult = true;
    
    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        new FizzBuzzTest().assertEquals("1", fizzBuzz.say(1));
        new FizzBuzzTest().assertEquals("Fizz", fizzBuzz.say(3));
        new FizzBuzzTest().assertEquals("Buzz", fizzBuzz.say(5));
        
        outputTestResult();
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
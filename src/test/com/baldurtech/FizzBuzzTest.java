package com.baldurtech;

public class FizzBuzzTest {
    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        new FizzBuzzTest().assertEquals("1", fizzBuzz.say(1));
        new FizzBuzzTest().assertEquals("Fizz",fizzBuzz.say(3));
        }
    public void assertEquals(String exceptedResult,String actualResult) {
        if(exceptedResult.equals(actualResult)) {
            
        }else {
            outputTestResult();
        }
    }
    public void outputTestResult() {
        System.out.println(false);
    }
}
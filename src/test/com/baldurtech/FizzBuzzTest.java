package com.baldurtech;

public class FizzBuzzTest {
    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        System.out.println("1".equals(fizzBuzz.say(1)));
        System.out.println("Fizz".equals(fizzBuzz.say(3)));
    }
}
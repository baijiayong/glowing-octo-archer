package com.baldurtech;

public class FizzBuzzTestCase extends FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();
    public void test_1_should_be_1() {
        assertEquals("1", fizzBuzz.say(1));
    }
    
    public void test_3_should_be_Fizz() {
        assertEquals("Fizz", fizzBuzz.say(3));
    }
    
    public void test_5_should_be_Buzz() {
        assertEquals("Buzz", fizzBuzz.say(5));
    }
    
    public void test_ture_should_be_True() {
        assertTrue(1 == 1);
    }
    
    public void test_false_should_be_false() {
        assertFalse(1 == 2);
    }
}
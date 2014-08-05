package com.baldurtech;

import java.lang.reflect.Method;

public class FizzBuzzTest {
    public static Boolean testResult = true;
    
    public static void main(String args[]) throws Exception {
        
        Method[] methods = FizzBuzzTestCase.class.getDeclaredMethods();
        for(Method method : methods) {
            
            if(method.getName().startsWith("test")){
                Object obj = FizzBuzzTestCase.class.newInstance();
                method.invoke(obj, new Object[] {});
            }
        }
        
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
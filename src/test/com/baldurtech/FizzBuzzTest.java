package com.baldurtech;

import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

public class FizzBuzzTest {
    public static Boolean testResult = true;
    
    public static void main(String args[]) throws Exception {
        runAllTest(FizzBuzzTestCase.class);             
        outputTestResult();
    }
    
    public static void runAllTest(Class clazz) throws Exception{
        for(Method method : getAllMethods(clazz)) {
            System.out.println("testing : " + method);
            Object obj = clazz.newInstance();
            method.invoke(obj, new Object[] {});
        }
    }
    
    public static List<Method> getAllMethods(Class clazz){
    
    List<Method> testMethod = new ArrayList<Method>();
        
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods) {
            
            if(method.getName().startsWith("test")){
                testMethod.add(method);
                
            }
        }
        return testMethod;
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
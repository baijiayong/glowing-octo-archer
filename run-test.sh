#!/bin/sh

echo "Run-Test"

java -classpath "target/classes;target/test-classes;lib/reflections-0.9.9-RC2.jar;lib/javassist-3.18.2-GA.jar;lib/guava-15.0.jar" com.baldurtech.FizzBuzzTest com.baldurtech.FizzBuzzTestCase

echo "Run-Test Done"

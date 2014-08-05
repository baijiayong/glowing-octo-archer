#!/bin/sh

echo "Compile"

mkdir -p target/{classes,test-classes}/

javac -d target/classes src/main/com/baldurtech/FizzBuzz.java

javac -d target/test-classes -classpath "target/classes;lib/reflections-0.9.9-RC2.jar" src/test/com/baldurtech/*.java

echo "Compile Done"

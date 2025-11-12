package org.example.Automation.Demo.Basics.JavaBasics.Day3.ConceptOfPolymorphism;

public class MethodOverloading {
    public static int addition(int a , int b) {
        int sum = a + b;
        return sum;
    }
    public static int addition(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }
    public static void main(String [] args){
        System.out.println(addition(7, 4));
        System.out.println(addition(7,4,3));
    }
}


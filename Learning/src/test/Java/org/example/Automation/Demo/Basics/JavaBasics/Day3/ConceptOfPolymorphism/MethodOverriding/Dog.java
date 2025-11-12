package org.example.Automation.Demo.Basics.JavaBasics.Day3.ConceptOfPolymorphism.MethodOverriding;

public class Dog extends Animal {
    @Override
    public void sound() {   // overriding parent method
        System.out.println("Dog barks");
    }
}

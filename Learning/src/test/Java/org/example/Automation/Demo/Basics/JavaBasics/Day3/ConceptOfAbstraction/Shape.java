package org.example.Automation.Demo.Basics.JavaBasics.Day3.ConceptOfAbstraction;

public abstract class Shape {
    // abstract method (no body)
    abstract void draw();

    // concrete method (has body)
    public void info() {
        System.out.println("This is a shape");
    }
}
package org.example.Automation.Demo.Basics.JavaBasics.Day4.InterfaceDemo;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat is eating Fish");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void move() {
        System.out.println("Cat Moves");
    }

    @Override
    public void info() {
        System.out.println("This is a Cat class implementing Animal");
    }
}

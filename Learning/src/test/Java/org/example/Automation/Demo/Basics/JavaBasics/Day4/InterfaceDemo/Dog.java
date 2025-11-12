package org.example.Automation.Demo.Basics.JavaBasics.Day4.InterfaceDemo;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating bone");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
    public void sound(){
        System.out.println("Dog Barks");
    }
    public void move(){
        System.out.println("Dog Moves");
    }
    public void info(){
        System.out.println("This is a Dog class implementing Animal");
    }
}

package org.example.Automation.Demo.Basics.JavaBasics.Day4.InterfaceDemo;

public class Kitten extends Cat{
    public void play(){
        System.out.println("Kitten is playing with yarn");
    }

    @Override
    public void sound() {
        System.out.println("Kitten meows softly");
    }
}

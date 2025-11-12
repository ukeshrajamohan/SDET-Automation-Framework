package org.example.Automation.Demo.Basics.JavaBasics.Day4.InterfaceDemo;

public class jungle {
public static void main(String[] arg){
    Animal a1 = new Dog();
    a1.eat();
    a1.move();
    a1.sound();
    a1.sleep();
    a1.info();
 Animal a2 = new Cat();
 a2.eat();
 a2.move();
 a2.sound();
 a2.sleep();
 a2.info();
    Cat c1 = new Kitten();
    c1.sound();
    // Child-specific method
    Kitten k1 = new Kitten();
    k1.play();

    puppy p1 = new puppy();
    p1.play();
}
}

package org.example.Automation.Demo.Basics.JavaBasics.Day3.ConceptOfPolymorphism.MethodOverriding;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

        public static void main(String[] args) {
            Animal a1 = new Animal();
            Animal a2 = new Dog();
            Animal a3 = new Cat();

            a1.sound(); // Animal makes a sound
            a2.sound(); // Dog barks (overridden method is called)
            a3.sound(); // Cat meows
        }
}

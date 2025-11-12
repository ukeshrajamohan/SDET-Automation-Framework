package org.example.Automation.Demo.Basics.JavaBasics.Day3.ConceptOfAbstraction;

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();   // Drawing a Circle
        s2.draw();   // Drawing a Rectangle
    }
}


package com.tintran.demo;

public class TestInterfaceShape {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(5, 10);
        Rectangle rectangle = new Rectangle(5, 10);
        Rectangular rectangular = new Rectangular(5, 10, 15);

        circle.display();
        cylinder.display();
        rectangle.display();
        rectangular.display();
    }
}

package com.tintran;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        System.out.println("Radius: " + c1.getRadius() + " Color: " + c1.getArea());
        Circle c2 = new Circle(5);
        System.out.println("Radius: " + c2.getRadius() + " Area: " + c2.getArea());
    }
}

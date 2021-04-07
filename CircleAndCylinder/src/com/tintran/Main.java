package com.tintran;

public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle(5);
	Cylinder cylinder = new Cylinder(5,7);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getAllPerimeter());
        System.out.println(cylinder.getAroundPerimeter());
    }
}

package com.tintran.demo;

public class Circle implements Shape{
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius,2) * 3.14;
    }

    @Override
    public double getPerimeter() {
        return 3.14 * 2 * this.radius;
    }

    @Override
    public void display() {
        System.out.println("This is Circle radius is " + this.radius + ", Area: " + getArea() + ", Perimeter: " + getPerimeter());
        System.out.println("***************************");
    }
}

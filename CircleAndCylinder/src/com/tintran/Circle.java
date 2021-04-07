package com.tintran;

public class Circle {
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * 2 * 3.14;
    }
    public double getPerimeter(){
        return Math.pow(this.radius,2) * 3.14;
    }
}

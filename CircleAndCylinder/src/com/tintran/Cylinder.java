package com.tintran;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){

    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getAroundPerimeter(){
        return super.getArea() * height;
    }
    public double getAllPerimeter(){
        return getAroundPerimeter() + (2*3.14*Math.pow(getRadius(),2));
    }
    public double getVolume(){
        return Math.pow(getRadius(),2)*3.14*height;
    }
}

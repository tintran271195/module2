package com.tintran;

public class Circle {
    private static double radius = 1.0;

    private String color = "Red";


    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public void Circle(double radius){

    }
    public static double getRadius(){
        return radius;
    }
   public double getArea(){
        return radius*3.14;
    }
}

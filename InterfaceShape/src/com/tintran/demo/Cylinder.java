package com.tintran.demo;

public class Cylinder extends Circle implements VolumeShape {
    private double heightCylinder;
    public Cylinder(){

    }
    public Cylinder(double radius, double heightCylinder){
        super(radius);
        this.heightCylinder = heightCylinder;
    }

    public double getHeightCylinder() {
        return heightCylinder;
    }

    public void setHeightCylinder(double heightCylinder) {
        this.heightCylinder = heightCylinder;
    }

    @Override
    public double getVolume() {
        return 3.14 * Math.pow(getRadius(),2) * this.heightCylinder;
    }

    @Override
    public void display() {
        System.out.println("This is Cylinder, radius: " + getRadius() + ", height: " + this.heightCylinder + ", Volume: " + getVolume());
        System.out.println("***************************");
    }
}

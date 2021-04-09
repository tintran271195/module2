package com.tintran.demo;

public class Rectangular extends Rectangle implements VolumeShape{
    private double height;
    public Rectangular(){

    }
    public Rectangular(double width, double length, double height){
        super(width,length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    @Override
    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public void display() {
        System.out.println("This is Rectangular, width: " + getWidth() + ", length " + getLength() + ", height: " + this.height + ", Volume: " +getVolume());
        System.out.println("***************************");
    }
}

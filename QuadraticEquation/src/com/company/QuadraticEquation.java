package com.company;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(double a, double b, double c){
        return Math.pow(b,2) - 4*a*c;
    }
    public double getRoot1(double a, double b, double c){
        return (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    }
    public double getRoot2(double a, double b, double c){
        return (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    }
    public double getRoot(double a, double b, double c){
        return -b/(2*a);
    }
}

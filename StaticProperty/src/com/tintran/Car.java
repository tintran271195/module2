package com.tintran;

public class Car {

    public static String name;
    public static String engine;
    public static int numberOfCar;

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

}

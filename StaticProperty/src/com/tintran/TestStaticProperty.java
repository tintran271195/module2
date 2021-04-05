package com.tintran;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "Skyactiv 3");
        System.out.printf("Id Car%d CarName: %s Car.engine %s%n", Car.numberOfCar, Car.getName(), Car.getEngine());
        Car car2 = new Car("Madza 6", "Skyactiv 6");
        System.out.printf("Id Car%d CarName: %s Car.engine %s%n", Car.numberOfCar, Car.getName(), Car.getEngine());
    }
}

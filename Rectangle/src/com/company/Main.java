package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("Enter the Width: ");
        double width = input.nextDouble();
        System.out.println("Enter the Height: ");
        double height = input.nextDouble();
        Rectangle rec = new Rectangle(width, height);
    }
}

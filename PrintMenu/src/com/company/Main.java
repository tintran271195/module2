package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle bottom-left");
            System.out.println("3. Print the square triangle top-left");
            System.out.println("4. Print the square triangle bottom-right");
            System.out.println("5. Print the square triangle top-right");
            System.out.println("6`x. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 2: {
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++){
                            System.out.print("* ");
                    }
                    System.out.println(""); }
                    break;}
                case 3:{
                    for (int i = 5; i > 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("You has no choice");
                }

            }
        }
    }
}
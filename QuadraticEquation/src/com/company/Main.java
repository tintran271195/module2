package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("Nhap gia tri cua phuong trinh a*x*x+b*x+c=0");
        System.out.println("Nhap gia tri a: ");
        double a = input.nextDouble();
        System.out.println("Nhap gia tri b: ");
        double b = input.nextDouble();
        System.out.println("Nhap gia tri c: ");
        double c = input.nextDouble();
        QuadraticEquation qua = new QuadraticEquation(a,b,c);
        double delta = qua.getDiscriminant(a,b,c);
        if (delta < 0 ){
            System.out.println("Phuong trinh vo nghiem.");
        } else if(delta == 0){
            System.out.println("Phuong trinh co 1 nghiem kep: " + qua.getRoot(a,b,c));
        } else {
            System.out.println("Phuong trinh co 2 nghiem, nghiem 1 :" + qua.getRoot1(a,b,c) + " nghiem 2: " + qua.getRoot2(a,b,c));
        }
    }

}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số muốn kiểm tra có phải là số nguyên tố: ");
        int number = sc.nextInt();
        String mess ="";
        if (number < 2){
            System.out.print(number + "không phải là số nguyên tố");
        } else {
            int i  = 3;
            boolean check = true;
            while ( i  <= Math.sqrt(number)){
                if (number % i == 0 ){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + " là số nguyên tố");
            }else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        }

    }
}

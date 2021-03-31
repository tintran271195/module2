package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nhap ngay: ");
            Scanner scanner = new Scanner(System.in);
            int day = scanner.nextInt();
            switch (day){
                case 2:
                    System.out.println("ngay dau tuan");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("ngay giua tuan");
                    break;
                case 6:
                    System.out.println("ngay cuoi tuan");
                    break;
                case 7:
                case 8:
                    System.out.println("ngay nghi");
                    break;
                default:
                    System.out.println("khong co ngay");
                    break;
            }

    }
}

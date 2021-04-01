package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String student[] = {"Tin", "Han","Duong","Phong","Khanh"};
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a name's student");
    String studentName = input.nextLine();
    Boolean isExits = false;
    for ( int i = 0; i < student.length; i++) {
        if (student[i].equals(studentName)) {
            System.out.println("Position of the student in the list " + studentName + " is: " + (i + 1));
            isExits = true;
            break;
        }
    }
    if(isExits = false)
        System.out.println("Not Found");
    }
}

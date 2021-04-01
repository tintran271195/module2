package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = createArray();
        printArray(arr);
        int max = findMax(arr);
        System.out.println("so lon nhat la " + max);
    }



    public static int[] createArray() {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100);
        }
            return arr;
    }
    public static void printArray(int[] arr){
        for (int a: arr){
            System.out.print(a + "  ");
        }
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for ( int i =1; i< arr.length; i++){
            if ( max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}


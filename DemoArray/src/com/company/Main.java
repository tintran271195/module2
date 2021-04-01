package com.company;

public class Main {
    public static void main(String[] args) {
        int[] arr = array();
        printArr(arr);
        int max = findMax(arr);
        System.out.println("Max " +max);
    }
    public static int[] array(){
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) Math.floor(Math.random()*100);

        }
        return arr;
    }
    public static int findMax(int arr[]){
        int max = arr[0];
        for ( int i= 1; i < arr.length; i++){
            if ( max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static  void printArr(int[] arr){
        for ( int i = 0; i < arr.length;i++){
            System.out.print("number   " + i + ": " + arr[i] + "     ");
        }
    }
}
package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr =new int[10];
	for (int i = 0; i <arr.length;i++){
	    arr[i]= (int) Math.floor(Math.random()*100);
        System.out.println(arr[i]);
    }

	int min = findMin(arr);
        System.out.println("min " + min);
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for ( int i=1; i < arr.length;i++){
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }
}

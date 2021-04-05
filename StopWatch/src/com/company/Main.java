package com.company;

import java.time.LocalTime;
import java.util.Scanner;
class StopWatch {
    private long startTime;
    private long endTime;
    void start() {
        this.startTime = System.currentTimeMillis();
    }
    void stop() {
        this.endTime = System.currentTimeMillis();
    }
    long getElapsedTime() {
        return (this.endTime - this.startTime);
    }
    public static void main(String[] args) {
        StopWatch test = new StopWatch();
        int[] arr = new int[100000];
        test.start();
        for (int i = 0; i < 100000; i++) { //100.000
            arr[i] = (int) (Math.random() * 100 + 1); //tạo giá trị ngẫu nhiên cho mảng
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        test.stop();
        System.out.println(test.getElapsedTime());
    }
}

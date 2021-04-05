package com.tintran;

public class Student {
     private int rollno;
    private String name;
    private static String college = "BBDIT";
    // Hàm để khởi tạo biến
    public Student(int r, String n){
       rollno = r;
       name = n;
    }
    // Phương thức Static để thay đổi giá trị của biến Static
    public static void change(){
       college = "CODEGYM";
    }
    // Phương thức xuất ra giá trị
    public void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

}

package com.tintran.Array;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);


        listInteger.display();


        System.out.println(listInteger.indexOf(4));











    }
    
}

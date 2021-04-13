package com.tintran.demp;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.add(1, 1);
        linkedList.add(2, 2);
        linkedList.add(3, "Tin");
        linkedList.add(4, 4);
        linkedList.add(5, 5);
        linkedList.add(6, 6);
        linkedList.add(7, 7);

//        linkedList.printList();
//        System.out.println(linkedList.get(1));
//        System.out.println("size: " + linkedList.size());
//        System.out.println("*************************");
//        linkedList.add(8,8);
//
//        linkedList.printList();
//        System.out.println("size: " + linkedList.size());
//        System.out.println("*************************");

//

        MyLinkedList listClone = linkedList.getClone();
        listClone.printList();
        System.out.println(linkedList.indexOf("tin"));
    }
}

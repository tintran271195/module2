package com.tintran.demp;


public class MyLinkedList {
    private Node head;
    private int numNode;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        int i = 0;
        while (i < index - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }
        holder = temp.next;
        Node insertNode = new Node(data);
        temp.next = insertNode;
        insertNode.next = holder;
        numNode++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }

    public void addLast(Object data) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        temp.next.next = null;
        numNode++;
    }

    public void remove(int index) {
        Node temp = head;
        Node deleteIndex;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        deleteIndex = temp.next;
        temp.next = temp.next.next;
        deleteIndex = null;
        numNode--;
    }

    public void remove(Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < numNode && temp != null; i++) {

            if (temp.next.data == data) {
                Node delNode = temp.next;
                holder = delNode.next;
                temp.next = holder;
                delNode = null;
                numNode--;
            }
            temp = temp.next;
        }
    }

    public Object get(int index) {
        Node temp = head;
        int i;

        for (i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        System.out.println("i = " + i + ", data = " + temp.data);
        return temp.data;
    }

    public int size() {
        int size = 0;
        for (int i = 0; i <= numNode; i++) {
            size++;
        }
        return size;
    }

    public void printList() {
        Node temp = head;
        for (int i = 0; i <= numNode + 1 && temp != null; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public MyLinkedList getClone(){
        MyLinkedList listClone = new MyLinkedList(head.data);
        Node temp = head;
        for (int i = 0; i < numNode; i++){
            temp = temp.next;
            listClone.addLast(temp.data);
        }
        return listClone;
    }
    public boolean contains(Object data){
        Node temp = head;
        for (int i = 0; i < numNode ; i++){
            if (temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int indexOf(Object data){
        Node temp = head;
        for(int i = 0; i < numNode ; i++){
            if (temp.data ==data){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
}

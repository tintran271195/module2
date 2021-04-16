package QueueByLinkedList;

import MyStackbyLinkedList.Node;

public class QueueByLinkedList {

    private Node head;
    private int size;

    public QueueByLinkedList(Object data){
        head = new Node(data);
    }

    public void push(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        size++;
    }
    public void pop(){
        Node temp = head;
        for (int i = 0; i < size - 1 ; i++) {
            temp = temp.next;
        }
        Node delNode = temp.next;
        temp.next = delNode.next;
        delNode = null;
        size--;
    }
    public void peek(){
        Node temp = head;
        for (int i = 0; i < size ; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public void display(){
        Node temp = head;
        for(int i = 0; i < size + 1 ;i++){
            System.out.println(temp.data + "  ");
            temp = temp.next;
        }
    }
    public void search(Object data){
        Node temp = head;
        for (int i = 0; i < size + 1; i++) {
            if ( temp.data == data){
                System.out.println("Position is " + i);
                break;
            }
            else temp = temp.next;
        }
    }
}

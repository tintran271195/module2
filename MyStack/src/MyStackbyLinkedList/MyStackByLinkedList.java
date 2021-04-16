package MyStackbyLinkedList;


public class MyStackByLinkedList {
    private Node head;
    private int size = 0;


    public MyStackByLinkedList(Object data) {
        head = new Node(data);
    }


    public void push(Object data) {

            Node temp = head;
            for (int i = 0; i < size; i++) {
                temp = temp.next;
            }
            temp.next = new Node(data);
            temp.next.next = null;
            size++;
        }



    public void pop(){
        Node temp = head;
        for (int i = 0; i < size - 1 ; i++) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void peek(){
        Node temp = head;
        for (int i = 0; i < size ; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void printStack() {
        Node temp = head;
        for (int i = 0; i < size + 1; i++) {
            System.out.println("Elements" + (i + 1) + " = " + temp.data);
            temp = temp.next;
        }
    }

    public int search(Object data) {
        Node temp = head;
        for(int i = 0; i < size + 1  ; i++){
            if (temp.data ==data){
                return i + 1;
            }
            temp = temp.next;
        }
        return -1;
    }
}

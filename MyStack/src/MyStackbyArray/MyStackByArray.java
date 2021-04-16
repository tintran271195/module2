package MyStackbyArray;

public class MyStackByArray<E> {
    public static final int DEFAULT_CAPACITY = 10;
    private int size;
    private E[] elements;

    public MyStackByArray() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }


    public boolean isFull() {
        if (size == DEFAULT_CAPACITY) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size < 0) {
            return true;
        } else return false;
    }

    public void push(E e) {
        if (isFull()) {
            System.out.println("Stack is full !!");
        } else {
            elements[size] =  e;
            size++;

        }


    }

    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            E temp = elements[size];
            elements[size] = null;
            size--;
            return temp;
        }
    }
    public E peek(){
            E temp = elements[size - 1];
            return temp;
    }
    public void display(){
        for(int i = 0 ; i < size; i++){
            System.out.println("Elements " + (i+1) + " = " +elements[i]);
        }
    }

}

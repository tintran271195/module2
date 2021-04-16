package QueueByArray;

import java.util.Arrays;

public class  QueueByArray<E> {
    private E[] E;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public QueueByArray() {
        E = (E[]) new Object[10];
    }

    public boolean isFull() {
        return size > DEFAULT_CAPACITY ? true : false;
    }

    public boolean isEmpty() {
        return (size == 0) ? true : false;
    }

    private void ensureCapacity() {
        int newSize = DEFAULT_CAPACITY * 2;
        E = Arrays.copyOf(E, newSize);
    }

    public void push(Object data) {
        if (size == E.length) {
            ensureCapacity();
        }
        E[size] = (E) data;
        size++;
    }

    public E pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return null;
        }
        E del = E[0];
        for (int i = 1; i < size; i++) {
            E[i - 1] = E[i];
        }
        size--;
        return del;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(E[i]);
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println(E[0]);
        }
    }
}

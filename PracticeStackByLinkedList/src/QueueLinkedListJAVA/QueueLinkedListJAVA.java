package QueueLinkedListJAVA;


import java.util.EmptyStackException;
import java.util.LinkedList;

public class QueueLinkedListJAVA<E> {
    private LinkedList<E> queue;

    public QueueLinkedListJAVA() {
        queue = new LinkedList<>();
    }

    public void push(E elements) {
        queue.addLast(elements);

    }

    public boolean isEmpty() {
        if (queue.size() == 0) {
            return true;
        }
        return false;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.removeFirst();
    }

    public int size() {
        return queue.size();
    }
    public String toString(){
        return queue.toString() ;

    }
    public int indexOf(E elements){
        return queue.indexOf(elements);
    }
    public boolean contains(E e){
        return queue.contains(e);
    }

}

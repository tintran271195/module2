public class Reverse {
    private int[] array;
    private int size;

    public Reverse(){
        array = new int[10];
    }
    public boolean isEmpty(){
        return size == 0 ? true : false;
    }

    public boolean isFull(){
        return size == 10 ? true : false;
    }
    public void peek(){
        System.out.println(array[size-1]);
    }
    public void add(int key){
        if (isFull())
            System.out.println("Array is Full!!");
        array[size] = key;
        size++;
    }
    public int pop(){
        if (isEmpty())
            System.out.println("Array is Empty!!");
        size--;
        return array[size];
    }
    public void display(){
        for (int i = 0; i < size ; i++) {
            System.out.println("Element " + i  + " = " +array[i]);
        }
    }
    public void reserve(){
        int[] reArray = new int[10];
        for (int i = 0; i < size ; i++) {
            reArray[i] = array[size - 1 - i];
        }
        array = reArray;
    }
}

package QueueByLinkedList;

public class TestQueueLinkedList {
    public static void main(String[] args) {
        QueueByLinkedList test = new QueueByLinkedList(9);
        test.display();
        System.out.println("**************");
        test.push(7);
        test.display();
        System.out.println("------------------");
        test.pop();
        test.display();
    }
}

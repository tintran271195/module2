package QueueByArray;

public class TestQueueByArray {
    public static void main(String[] args) {
        QueueByArray<Integer> test = new QueueByArray<Integer>();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        test.push(6);
        test.push(7);
        test.push(8);
        test.push(9);
        test.push(10);
        test.push(11);
        test.push(12);

        test.display();
        System.out.println("**********************");
        test.pop();
        test.pop();

        test.pop();
        test.pop();
        test.pop();
        test.pop(); test.pop();
        test.pop();
        test.pop();
        test.pop(); test.pop();
        test.pop();
        test.pop();

        test.display();
        System.out.println("++++++++++++++++++++++++++++");
        test.peek();
    }
}

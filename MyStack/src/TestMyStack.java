public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Integer> test = new MyStack<Integer>();
        test.push(5);
        test.push(15);
        test.push(25);
        test.push(35);

        test.display();


        System.out.println(test.peek());
        test.pop();
        test.display();
    }
}

package MyStackbyArray;

public class TestMyStack {
    public static void main(String[] args) {
        MyStackByArray<Integer> test = new MyStackByArray<Integer>();
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

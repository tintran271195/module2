package MyStackbyLinkedList;



public class Test {
    public static void main(String[] args) {
        MyStackByLinkedList test = new MyStackByLinkedList(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(7);

        test.printStack();
        System.out.println("********************");
        System.out.println(test.search(7));
    }
}

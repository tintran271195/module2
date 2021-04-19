package QueueLinkedListJAVA;

public class TestLinkedList {
    public static void main(String[] args) {
        QueueLinkedListJAVA<String> test = new QueueLinkedListJAVA<String>();

        test.push("Tin");
        test.push("Han");
        test.push("Khanh");
        test.push("Phong");


        System.out.println(test.size());
        System.out.println(test.contains("Phong"));

        System.out.println(test.toString());
    }
}

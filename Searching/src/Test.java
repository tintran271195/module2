import Search.LinearSearch;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 8, 6, 4, 2};
        int x = 2;
        int result = LinearSearch.search(arr, x);

        System.out.println(result);
    }
}

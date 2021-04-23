public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 8, 6, 4, 2};
        for (int i = 1; i < arr.length; i++) {
            int holder = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > holder) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = holder;
        }
        for (int test : arr
        ) {
            System.out.println(test);
        }
    }
}

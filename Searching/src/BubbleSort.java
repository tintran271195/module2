public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,9,5,4,8,1};
        int k = arr.length - 1;
        for (int i = 0; i < k   ; i++) {
            for (int j = 0; j < k - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int test: arr
             ) {
            System.out.println(test);
        }
    }
}

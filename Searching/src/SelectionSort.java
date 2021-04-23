public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 6, 2, 4, 7};
        for (int i = 0; i < arr.length ; i++) {
            int minIndex = i;
            for ( int j = i+1; j < arr.length  ; j++){
                if( arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if ( i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex ] = temp;
            }
        }
        for (int test: arr
             ) {
            System.out.println(test);
        }
    }
}

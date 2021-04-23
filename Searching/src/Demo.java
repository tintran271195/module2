public class Demo {
    public int count(int[] arr, int key){
        int count =0;
        for ( int i = 0 ; i < arr.length; i++){
            if( arr[i] == key)
            count+=1;
        }
        return count;
    }
    public int minSecond(int[] arr){
        int min = arr[0];
        int minSec = arr[1];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }


            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > min && arr[j] < minSec) {
                    minSec = arr[j];
                }
            }
        }
        return minSec;
    }

    public static void main(String[] args) {
        int[] arr = { 1,3,5,9,9,9,9,9,9,5,5};
        Demo demo = new Demo();
        System.out.println(demo.minSecond(arr));
        System.out.println(demo.count(arr, 9));
    }
}

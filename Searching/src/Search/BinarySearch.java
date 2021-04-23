package Search;

public class BinarySearch {
    public int binarySearch(int[] arr,int l, int r, int key){


        while( r >= l){
            int mid = l + (r - l)/ 2;
            if (arr[mid] == key)
                return mid;
            else  if ( arr[mid] > key){

                return binarySearch(arr,l, mid - 1,key);
            }
            else {
                l = mid + 1;
                return binarySearch(arr,mid + 1 , r,key);
            }
        }
        return  - 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        BinarySearch demo = new BinarySearch();
        System.out.println(demo.binarySearch(arr,0, arr.length - 1,4 ));
    }
}

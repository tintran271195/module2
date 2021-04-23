import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i < 100 ; i ++){
            arr[i] = random.nextInt(100);
            System.out.println("Postion " + (i + 1) + " =  "  + arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample test = new ArrayExample();
        Integer[] arr = test.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your position you want to check value: ");
        int x = input.nextInt();

        try{
            System.out.println("Value at " + x + " = " + arr[x - 1]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Your position does not exit .");
        }

    }
}

package IllegalTriangleException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean repeatSidesInput = true;
        do{
            System.out.println("Enter three sides of triangle:");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

            try{
                Triangle triangle = new Triangle(side1,side2,side3);
                repeatSidesInput = false;

                System.out.println(triangle.toString());

            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
        while (repeatSidesInput);
    }
}

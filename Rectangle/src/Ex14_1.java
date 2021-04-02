import com.company.Rectangle;

import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rec = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rec.display());
        System.out.println("Perimeter of the Rectangle: "+ rec.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rec.getArea());

    }
}

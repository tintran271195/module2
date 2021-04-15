import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        char choice;
        Scanner input = new Scanner(System.in);
        ATM atmTin = new ATM("Tran Quang Tin", 200000);

        do {
            atmTin.displayMenu();
            choice = input.next().charAt(0);


            switch (choice) {
                case 'a':
                    atmTin.displayAbout();
                    break;
                case 'd':
                    atmTin.displayDeposit();
                    break;
                case 'w':
                    atmTin.displayWithdraw();
                    break;
                case 'h':
                    atmTin.displayHistory();
                    break;
                case 'x':
                    System.exit('x');
                default:
                    System.out.println("Ban nhap sai, vui long nhap lai!! ");
            }
        } while (choice != 'x');

    }
}

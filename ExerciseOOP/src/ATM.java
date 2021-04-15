
import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private String name;
    private int amount;
    ArrayList<String> history = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    int deposit, withdraw;

    public ATM() {


    }

    public ATM(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void displayMenu() {
        System.out.println("MENU");
        System.out.println("1. Nhan phim A de kiem tra tai khoan");
        System.out.println("2. Nhan phim D de nap tien");
        System.out.println("3. Nhan phim W de rut tien");
        System.out.println("4. Nhan phim H de xem lich su 3 lan");
        System.out.println("5. Nhan phim X de thoat.");
        System.out.println("***************************************");
        System.out.println("Hay nhap lua chon cua ban!!!");
    }

    public void displayAbout() {
        System.out.println("So du tai khoan quy khach la: " + this.amount + " VND!");
        displayContMenu();
    }

    public void displayContMenu() {
        System.out.println("Bam nut theo MENU de tiep tuc giao dich");
        System.out.println("***************************************");
    }

    public void displayDeposit() {
        System.out.println("Giao dien nap tien");
        System.out.println("Vui long nhap so tien");
        deposit = input.nextInt();
        System.out.println("Giao dich thanh cong. Ban vua nap " + deposit + " thanh cong !");
        this.amount += deposit;
        history.add(0, "nap tien: " + deposit);
        System.out.println("So du tai khoan cua quy khach hien tai la: " + this.amount + " VND!");
        displayContMenu();

    }

    public void displayWithdraw() {
        System.out.println("Giao dich rut tien");
        System.out.println("Vui long nhap so tien:");
        withdraw = input.nextInt();
        if (withdraw > this.amount) {
            System.out.println("So du cua quy khach khong du de thuc hien giao dich nay, vui long thu lai sau!");
            System.out.println("So tien cua quy khach la: " + this.amount);
            displayContMenu();
        } else {
            System.out.println("Quy khach da rut thanh cong so tien la: " + withdraw + " VND!");
            this.amount -= withdraw;
            history.add(0, "rut tien: " + withdraw);
            System.out.println("So tien con lai cua quy khach la: " + this.amount);
            displayContMenu();
        }
    }

    public void displayHistory() {
        if (history.size() > 4) {
            history.remove(3);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(history.get(i));
        }
    }

}

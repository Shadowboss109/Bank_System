
import java.util.Scanner;

public class Bank {

    private double balance;

    public Bank() {

        System.out.println("        WELCOME TO OUR ONLINE BANKING");
        System.out.println("CHOOSE THE NUMBER FOR THE OPTION THAT BEST SUITS YOU:");
        System.out.println("0. EXIT");
        System.out.println("1. WITHDRAW");
        System.out.println("2. DIPOSIT");
        System.out.println("3. DISPLAY CURRENT BALANCE");

        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option) {
            case 0:
                System.out.println("THANK YOU FOR BANKING US");
                break;

            case 1:
                System.out.println("ENTER THE AMOUNT YOU WOULD LIKE TO WITHDRAW");
                int withdraw_amount = in.nextInt();
                in.nextLine();
                if (withdraw_amount <= getBalance()) {
                    withdraw(withdraw_amount);
                    display();
                    break;
                } else {
                    System.out.println("INSUFFICIENT BALANCE! ");

                }

            case 2:
                System.out.println("ENTER THE AMOUNT YOU WOULD LIKE TO DEPOSIT");
                int deposit_amount = in.nextInt();
                deposit(deposit_amount);
                in.nextLine();
                display();
                break;

            case 3:
                display();
                break;
        }

    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        this.balance -= balance;
    }

    public void display() {
        System.out.printf("YOUR CURRENT BALANCE IS %.2f", getBalance());
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        ;
    }

}
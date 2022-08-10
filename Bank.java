
import java.util.Scanner;

public class Bank {

    private double balance;
    private String select;

    public Bank() {

        loopA: while (true) {
            // Display bank options
            System.out.println("        WELCOME TO OUR ONLINE BANKING");
            System.out.println("CHOOSE THE NUMBER FOR THE OPTION THAT BEST SUITS YOU:");
            System.out.println("0. EXIT");
            System.out.println("1. WITHDRAW");
            System.out.println("2. DIPOSIT");
            System.out.println("3. DISPLAY CURRENT BALANCE");

            // Select banking option
            try {

                Scanner in = new Scanner(System.in);
                int option = in.nextInt();

                switch (option) {
                    case 0:
                        System.out.println("THANK YOU FOR BANKING US");
                        break loopA;

                    case 1:
                        System.out.println("ENTER THE AMOUNT YOU WOULD LIKE TO WITHDRAW");
                        int withdraw_amount = in.nextInt();
                        in.nextLine();
                        if (withdraw_amount <= getBalance()) {
                            withdraw(withdraw_amount);
                            display();

                            moveOn();
                            select = in.next();
                            if (select.equals("y") || select.equals("Y")) {
                                break;
                            } else if (select.equals("n") || select.equals("N")) {
                                break loopA;
                            } else {
                                System.out.println("NOT A VALID OPTION");
                                break loopA;

                            }

                        } else {
                            System.out.println("INSUFFICIENT BALANCE! ");
                            break loopA;

                        }

                    case 2:
                        System.out.println("ENTER THE AMOUNT YOU WOULD LIKE TO DEPOSIT");
                        int deposit_amount = in.nextInt();
                        deposit(deposit_amount);
                        in.nextLine();
                        display();

                        moveOn();
                        select = in.next();
                        if (select.equals("y") || select.equals("Y")) {
                            break;
                        } else if (select.equals("n") || select.equals("N")) {
                            break loopA;
                        } else {
                            System.out.println("NOT A VALID OPTION");
                            break loopA;
                        }

                    case 3:
                        display();
                        moveOn();
                        select = in.next();
                        if (select.equals("y") || select.equals("Y")) {
                            break;
                        } else if (select.equals("n") || select.equals("N")) {
                            break loopA;
                        } else {
                            System.out.println("NOT A VALID OPTION");
                            break loopA;
                        }

                    default:
                        System.out.println("NOT A VALID OPTION");
                        break loopA;
                }
            } catch (Exception e) {
                System.out.println("NOT A VALID OPTION");
                break loopA;
            }
        }

    }

    // Return bank balance
    public double getBalance() {
        return this.balance;
    }

    // Deposit fund
    public void deposit(double balance) {
        this.balance += balance;
    }

    // Withdraw fund

    public void withdraw(double balance) {
        this.balance -= balance;
    }

    // Display balance
    public void display() {
        System.out.printf("YOUR CURRENT BALANCE IS $%.2f", getBalance());
        System.out.println(" ");
        System.out.println(" ");
    }

    // Continue online banking or end
    public void moveOn() {

        System.out.println("DO YOU WISH TO CONTINUE ? ");
        System.out.println("SELECT Y FOR YES");
        System.out.println("SELECT N FOR NO");
    }

    public static void main(String[] args) {
        Bank b = new Bank();

    }

}
public class Bank {

    private double balance;

    public Bank(){

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

    public void display(){
        System.out.printf("Your current balance is %.2f",getBalance());
    }

    public static void main(String[] args) {
        Bank b=new Bank();
        b.deposit(200);
        b.withdraw(50);
        b.display();
    }


    
    
}
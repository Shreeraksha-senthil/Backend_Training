package Day_02.Constructors;

public class Account_Cons_overloading {
    int accountNumber;
    int balance;

    Account_Cons_overloading(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    Account_Cons_overloading(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
    public static void main(String[] args) {
        Account_Cons_overloading account = new Account_Cons_overloading(12354);
        account.display();
        System.out.println();
        Account_Cons_overloading account1= new Account_Cons_overloading(85235,8000);
        account1.display();
    }



}

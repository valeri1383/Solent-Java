package Week_2;
import java.util.HashMap;

class BankAccount {
    double balance = 0;
    String accountNumber = "0000";

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }
}


public class Task_2 {
    public static void main(String[] args) {

        /*
        Task 2: Bank Account Class (Classes and Objects in Java)
        Create a class called "BankAccount" with instance variables "balance" and "accountNumber"
        Create two methods called "deposit" and "withdraw" that modify the "balance" instance variable
        Create two objects of the BankAccount class with different values for "balance" and "accountNumber"
        Call the deposit and withdraw methods for each object and print out the updated balance.
         */

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.accountNumber = "1000";
        account2.accountNumber = "2222";

        // depositing
        account1.deposit(100.50);
        account2.deposit(990);
        //System.out.println("Updated balance: " + account1.balance);
        System.out.println(String.format("Updated balance: %s for Account %s", account1.balance, account1.accountNumber));
        System.out.println(String.format("Updated balance: %s for Account %s", account2.balance, account2.accountNumber));

        // withdrawing
        account1.withdraw(50.50);
        account2.withdraw(90);
        System.out.println(String.format("Updated balance: %s for Account %s", account1.balance, account1.accountNumber));
        System.out.println(String.format("Updated balance: %s for Account %s", account2.balance, account2.accountNumber));

    }
}

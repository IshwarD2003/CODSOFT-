import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void withdraw(double amount) {
        userAccount.withdraw(amount);
    }

    public void deposit(double amount) {
        userAccount.deposit(amount);
    }

    public void checkBalance() {
        userAccount.checkBalance();
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);
        ATM atmMachine = new ATM(userAccount);
        Scanner scanner = new Scanner(System.in);

    
        atmMachine.deposit(200);
        atmMachine.withdraw(150);
        atmMachine.checkBalance();

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        atmMachine.withdraw(withdrawalAmount);

        scanner.close();
    }
}
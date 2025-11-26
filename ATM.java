import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    public void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient Balance!");
        else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(2000);

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> account.checkBalance();
                case 2 -> {
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                }
                case 3 -> {
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                }
                case 4 -> {
                    System.out.println("Thank You! Visit Again.");
                    return;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}

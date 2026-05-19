import java.util.Scanner;

class BankAccount {
    String name;
    int accNo;
    double balance;

    // Constructor
    BankAccount(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Successfully!");
        System.out.println("Current Balance = " + balance);
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Current Balance = " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Check Balance
    void checkBalance() {
        System.out.println("Account Holder = " + name);
        System.out.println("Account Number = " + accNo);
        System.out.println("Current Balance = " + balance);
    }
}

public class k {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Account
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount user = new BankAccount(name, accNo, balance);

        int choice;

        do {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    user.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    user.withdraw(withdrawAmount);
                    break;

                case 3:
                    user.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You for Using Bank System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

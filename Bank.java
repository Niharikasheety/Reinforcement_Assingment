import java.util.Scanner;

class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;   // initial balance
        int choice, amount;

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter deposit amount: ");
                amount = sc.nextInt();
                balance = balance + amount;
                System.out.println("Amount Deposited Successfully");
                System.out.println("Current Balance = " + balance);
                break;

            case 2:
                System.out.print("Enter withdraw amount: ");
                amount = sc.nextInt();
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Amount Withdrawn Successfully");
                } else {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("Current Balance = " + balance);
                break;

            case 3:
                System.out.println("Current Balance = " + balance);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

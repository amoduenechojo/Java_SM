import java.util.Scanner;

public class SimpleATM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 1000.00;
        int choice = 0;

        while (choice != 4) {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.println("Enter amount to deposit:");
                    double deposit = input.nextDouble();
                    balance = balance + deposit;
                    System.out.println("New balance: " + balance);
                }

                case 2 -> {
                    System.out.println("Enter amount to withdraw:");
                    double withdraw = input.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Insufficient funds");
                    } else {
                        balance =  balance + withdraw;
                        System.out.println("Withdraw successful!");
                    }
                }

                case 3 -> 
                    System.out.println("Your current balance is: " + balance);

                case 4 -> 
                    System.out.println("Exit page!");

                default -> 
                    System.out.println("Invalid input, try again!");
            }
        }

    }
}

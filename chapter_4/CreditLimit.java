import java.util.Scanner;
    public class CreditLimit{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Account number: ");
        int account = input.nextInt();

        System.out.println("Beginning balance: ");
        int balance = input.nextInt();

        System.out.println("Charges: ");
        int charges = input.nextInt();

        System.out.println("Credits: ");
        int credits = input.nextInt();        
        
        System.out.println("Credit limit: ");
        int limit = input.nextInt();

        int newBalance = balance + charges - credits;
        System.out.println("New balance: " + newBalance);

        if (newBalance > limit){
        System.out.println("Credit limit exceeded");
        }
      }
    }


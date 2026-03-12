import java.util.Scanner;
public class CreditLimit{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Account number: ");
        int accountNumber = input.nextInt();

while( accountNumber != -1){
        System.out.println("Beginning balance: ");
        int balance = input.nextInt();

        System.out.println("Charges: ");
        int totalCharges = input.nextInt();

        System.out.println("Credits: ");
        int totalCredits = input.nextInt();        
        
        System.out.println("Credit limit: ");
        int creditLimit = input.nextInt();

        int newBalance = balance + (totalCharges - totalCredits);
        System.out.println("New balance: " + newBalance);

        if (newBalance > creditLimit){
        System.out.println("Credit limit exceeded");
        }
      }
   
}
    }


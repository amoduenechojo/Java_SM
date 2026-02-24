import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = input.nextInt();

    
            int originalNumber = number;

            int reverse = 0;

            while(number > 0){
            int digit = number % 10;
            
            reverse = reverse * 10 + digit;
            number = number/10;

           }

            if(reverse == originalNumber){
            System.out.println("It is a palindrome");
            }
            else{
            System.out.println("It is not a palindrome");
}
}
    }

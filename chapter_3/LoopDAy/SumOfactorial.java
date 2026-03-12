import java.util.Scanner;
public class SumOfFactorial{
    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int number = 0;
    int sum = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for(int sumOfDigit = 1; sumOfDigit < number; sumOfDigit++){
            sum = sum + sumOfDigit;
            System.out.println("The sum of the digit is: " + sum);
            }

            for(int sumOfDigit = 1; sumOfDigit<= sum; sumOfDigit++){
                factorialOfSum = factorialOfSum * sumOfDigit;
            }


            System.out.println("The factorial sum is: " + sum);























    }
}

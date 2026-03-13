 import java.util.Scanner;

    public class Comparators{
        public static void main(String [] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int firstNumber = input.nextInt();

            System.out.println("Enter a number: ");
            int secondNumber = input.nextInt();

            if (firstNumber == secondNumber)
            System.out.println("0");

            else if (firstNumber <= secondNumber)
            System.out.println("1");

            if (secondNumber <= firstNumber)
            System.out.println("-1");

     }

        }

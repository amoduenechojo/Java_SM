import java.util.Scanner;
    public class ValidateInput{
        public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int number = 0;

        System.out.print("Enter a number between 1 and 2: ");
        number = input.nextInt();

        while(number != 1 && number != 2){
        System.out.println("Invalid input.");
        
        System.out.println("Enter a number between 1 and 2: ");
        number = input.nextInt();
    }

    }
        }

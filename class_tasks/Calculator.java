import java.util.Scanner;

public class Calculator{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

          
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            
            System.out.println("Choose an operation(1-4) \n");
            int choice = input.nextInt();

            System.out.println("Enter numbers: ");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            double num3 = input.nextDouble();


                switch(choice){ 
                    case 1 -> {
                    System.out.println("Addition = " + (num1 + num2 + num3));
                    }

                    case 2-> {
                    System.out.println("Subtraction = " + (num1 - num2 - num3));
                    }

                    case 3-> {
                    System.out.println("Multiplication = " + (num1 * num2 * num3));
                    }

                    case 4-> {
                    System.out.println("Division = " + () )}

                    default {
                    System.out.println("Not avaliable");
                    }
    

//            }


}
    }

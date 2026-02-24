import java.util.Scanner;

public class Calculator2{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);


            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
       
            
            System.out.println("Choose an operation(1-4)");
            String choice = input.nextLine();

            


        System.out.println("Enter the amount of number you want to calculate: ");
        int number = input.nextInt();
         

            if(number == 2){
            System.out.println("Enter num1: ");
            int num1 = input.nextInt();

            System.out.println("Enter num2: ");
            int num2 = input.nextInt();
            }
        
            else if(number == 3){
            System.out.println("Enter num1: ");
            int num1 = input.nextInt();

            System.out.println("Enter num2: ");
            int num2 = input.nextInt();

            System.out.println("Enter num3: ");
            int num3 = input.nextInt();
            }
//
//            else{
//            System.out.println("Enter a number between 1-4: ");
//           }
//            
         
    }
            public static double add(double num1, double num2){
                return num1 + num2;
            }


            public static double add(double num1, double num2, double num3){
                return num1 + num2 + num3;
            }


            public static double subtract(double num1, double num2){
                return num1 - num2;
            }

            public static double subtract(double num1, double num2, double num3){
                return num1 - num2 - num3;
            }

            public static double multiply(double num1, double num2){
                return num1 * num2;
            }
              
            public static double multiply(double num1, double num2, double  num3){
                return num1 * num2 * num3;
            }

            public static double division(double num1, double num2){
                return num1/num2;
            }

//            public static void double division(double num1, double num2, double num3){
//                return num1/num2/num3;
//            }
//
//


}


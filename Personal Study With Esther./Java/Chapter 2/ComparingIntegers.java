import java.util.Scanner;
public class ComparingIntegers{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int squareOfNumber = number * number;

        if(number > 100){
                System.out.println("The number is greater than 100.");
            }

         else if (number == 100){
                System.out.println("The number is equals to 100.");
                }

         else if(number != 100){
                System.out.println("The number is not equals to 100.");
                }

        else if(number < 100){
                System.out.println("The number is lesser than 100.");
                }



        if(squareOfNumber > 100){
                System.out.println("The square of number is greater than 100.");
            }
            else if (squareOfNumber == 100){
                System.out.println("The square of number is equals to 100.");
                }

            else if(squareOfNumber != 100){
                System.out.println("The square of number is not equals to 100.");
//                }
        
            else if(squareOfNumber < 100){
                System.out.println("The square of number is lesser than 100.");
                }
    }
}

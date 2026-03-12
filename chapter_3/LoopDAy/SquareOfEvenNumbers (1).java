import java.util.Scanner;
public class SquareOfEvenNumbers{
    public static void main(String [] args){
   
    Scanner input = new Scanner(System.in);

    int number = 10;  
    int square = 0;

    for(int count = 1; count <= 10; count ++){

    System.out.print("Enter a number: ");
    number = input.nextInt();

    if(number % 2 == 0){
        square = number * number; 
    System.out.println("The square of the number is: " + square);          
s
        }
    }

    }
}

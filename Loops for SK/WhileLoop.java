import java.util.Scanner;

public class WhileLoop{
    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number between 1 and 10: ");
    int number = input.nextInt();

    while(number < 1 || number > 10){
        System.out.print(number +  "is not a number between 1 and 10.");
        number = input.nextInt();
        }

    System.out.println(number + " " "is a number between 1 and 10.");
    


















    }
} 

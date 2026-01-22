import java.util.Scanner;
import java.util.Random;
    public class TaskTwo{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);        
        Random rand = new Random();

        System.out.println("Enter a number between 1 and 10: ");
        int figure = input.nextInt();

        int number = 1 + rand.nextInt(10);
        
        if (figure == number){
        System.out.println("You got the number.");
        } 

        else{System.out.printf("You no get am. The correct answer is %d%n" , number);
        }


    }
}

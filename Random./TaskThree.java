import java.util.Scanner;
import java.util.Random;
    public class TaskThree{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);        
        Random rand = new Random();

        int number = 1 + rand.nextInt(10);
        System.out.println("Enter a number between 1 and 10: ");
        int figure = input.nextInt();

//        while(figure != number){
//        System.out.println("Enter a number between 1 and 10: ");
//        int figured = input.nextInt();
        
            if (number > 10){
            System.out.println("Too high.");
            }
            
            else if(number < 10){
            System.out.println("Too low.");
            }

//        } 










    }
}

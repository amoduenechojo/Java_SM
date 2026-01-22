import java.util.Scanner;
import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

      
        int number = 1 + rand.nextInt(10);
        int figure = 0;

        System.out.println("I'm thinking of a number between 1 and 10.");

        while (figure != number) {
            System.out.print("Enter your guess: ");
            figure = input.nextInt();

            if (figure == number) {
                System.out.println("You got it.");
            } else if (figure > number) {
                System.out.println("Too high.");
            } else {
                System.out.println("Too low.");
            }
        }
    }
}

import java.util.Scanner;
import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = 1 + rand.nextInt(10); 
        int figure;
        boolean won = false;

        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("You have 10 attempts to guess it!");
        

        for (int attempts = 1; attempts <= 10; attempts++) {
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            figure = input.nextInt();

            if (figure == number) {
                System.out.println("Correct! You won in " + attempts + " tries.");
                won = true;
                break; 

            } else if (figure > number) {
                System.out.println("Too high.");
            } else {
                System.out.println("Too low.");
            }
        }

      
        if (!won) {
            System.out.println("Game Over! You've used all 10 guesses.");
            System.out.println("The number was: " + number);
        }
    }
}

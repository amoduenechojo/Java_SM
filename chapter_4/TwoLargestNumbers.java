import java.util.Scanner;

public class TwoLargestNumbers{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the first number
        System.out.print("Enter number 1: ");
        int number = input.nextInt();

        int largest = number;       // first number is largest so far
        int secondLargest = number; // initialize secondLargest too

        // Read the second number and adjust largest and secondLargest
        System.out.print("Enter number 2: ");
        number = input.nextInt();
        if (number > largest) {

            secondLargest = largest;
            largest = number;

        }
         else {
            secondLargest = number;
        }

        // Read numbers 3 to 10
        for (int count = 3; count <= 10; count++) {
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            if (number > largest) {

                secondLargest = largest;
                largest = number;

            } 
            else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);

    }
}

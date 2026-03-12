import java.util.Scanner;
public class RightAngleTriangle{
    public static void main(String [] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = input.nextInt();

            for (int row = 1; row <= number; row++){
                for (int column = 1; column <= row + 1; column++) {
            System.out.print(number - row + 1);
            }

    System.out.println();
    }
        }
       }






        

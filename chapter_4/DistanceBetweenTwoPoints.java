import java.util.Scanner;
public class DistanceBetweenTwoPoints{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x1 = input.nextInt();

        System.out.print("Enter a number: ");
        int x2 = input.nextInt();

        System.out.print("Enter a number: ");
        int y1 = input.nextInt();

        System.out.print("Enter a number: ");
        int y2 = input.nextInt();

            if(x1 == x2){
            System.out.print("The line is perpendicular to the x-axis(vertical line),");
            }

              if(y1 == y2){
            System.out.println("The line is perpendicular to the y-axis(horizontal line),");
            }

                else{
                System.out.println("The line is not perpendicular to any axis.");
                }
    }
}


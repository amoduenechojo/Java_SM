import java.util.Scanner;
public class CountDivisor1{
    public static int divisorOfNumber(int number){
//    Scanner input = new Scanner(System.in);

        int division = 0;

        for(int count = 0; count <= number; count++){
            if(number % count == 0){
                division ++;         

            }

        }

        return division;
}

    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    int total = divisorOfNumber(number);

    System.out.println("The total number of divisors: " + total);






}







    }

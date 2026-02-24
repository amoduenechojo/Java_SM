import java.util.Scanner;
public class CountDivisorOfNumber{
    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

//        int division = 0;
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int division = 0;
//        System.out.println("Divisors of " + number + " are:");
//        number = number/ divison;
        for(int count = 1; count <= number; count ++){
            if(number % count == 0){
                System.out.println(count);
                count ++;

            }

        }
        System.out.println("The total number of divisors:" + division); 
}
    }

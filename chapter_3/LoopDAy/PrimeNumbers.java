import java.util.Scanner;
    public class PrimeNumbers{
            public static void main(String [] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = input.nextInt();



            System.out.println("It is a prime number");
            if(number <= 1){
                System.out.println("Not a prime number.");
            }

            else{
                for(int count = 2; count < number; count ++){
                    if (number % count == 0){ 
                    System.out.println("False");
                }
                break;

            }
        }





            













    }
}

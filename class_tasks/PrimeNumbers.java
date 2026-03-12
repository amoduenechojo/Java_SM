import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int amountOfTimesDivided = 0;
    }

    
        public static void PrimeNumber(int number,  int amountOfTimesDivided){ 
            for(int divisor = 2; divisor <= number; divisor ++){

                if(number % divisor == 0){
                    amountOfTimesDivided++;
                }

            }
         }  

    
        public static void PrimeNumberChecker( int amountOfTimesDivided){
            if(amountOfTimesDivided < 2){
                System.out.println(number + " is a prime number");
            }

            else{
                System.out.println(number + " is not a prime number");
           }     

    }
        }
//}

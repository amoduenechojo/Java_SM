import java.util.Scanner;
public class MultiplesOfThree{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();


            if(number % 3 == 0){
                System.out.println("Number is divisible by 3");
        }

            else{
                System.out.println("Number is not divisible by 3"); }

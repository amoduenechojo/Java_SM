import java.util.Scanner;
public class BasicArithmetics{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter a number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter a number: ");
        int thirdNumber = input.nextInt();


        int sumOfNumbers = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum of the numbers: " ,sumOfNumbers);

        int averageOfNumbers = sumOfNumbers/3;
        System.out.println("The average of the numbers: " ,averageOfNumbers);

        int productOfNumbers = firstNumber * secondNumber * thirdNumber;
        System.out.println("The product of the numbers: " ,productOfNumbers);


         if(firstNumber < secondNumber){
            smallestNumber = secondNumber;
           }

        else if(secondNumber < thirdNumber){
            smallestNumber = thirdNumber;
            System.out.println("The smallest number is: " ,smallestNumber);
        }



        
         if(firstNumber > secondNumber){
            largestNumber = secondNumber;
           }

        else if(secondNumber > thirdNumber){
            largestNumber = thirdNumber;
            System.out.println("The largest number is: " ,largestNumber);
        }




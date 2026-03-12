import java.util.Scanner;
public class SquaredCalculation{
    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int firstNumber = input.nextInt();

    System.out.print("Enter a number: ");
    int secondNumber = input.nextInt();

    int squareOfFirstNumber =  firstNumber *  firstNumber;
    System.out.println("The square of the first number is: ", squareOfFirstNumber);


    int squareOfSecondNumber  = secondNumber * secondNumber;
    System.out.println("The square of the first number is: ",squareOfSecondNumber);

    int sumOfTheSquaresOfNumbers = squareOfFirstNumber + squareOfSecondNumber;
    System.out.println("The sum of square of the number is: ",sumOfTheSquaresOfNumbers);

    int differenceOfTheSquaresOfNumbers = squareOfFirstNumber - squareOfSecondNumber;
    System.out.println("The difference of square of the number is: ", differenceOfTheSquaresOfNumbers);




















    }
}

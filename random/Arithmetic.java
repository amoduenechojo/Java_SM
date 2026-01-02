import java.util.Scanner;
public class Arithmetic{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter firstNumber: ");
    int firstNumber = input.nextInt();

    System.out.print("Enter secondNumber: ");
    int secondNumber = input.nextInt();

    int squareOfFirstNumber = firstNumber * firstNumber;
    System.out.printf("The squareOfFirstNumber is %d%n ", squareOfFirstNumber);

    int squareOfSecondNumber = secondNumber * secondNumber;
    System.out.printf("The squareOfSecondNumber is %d%n ", squareOfSecondNumber);  

    int sumOfSquares = squareOfFirstNumber + squareOfSecondNumber;
    System.out.printf("The sumOfSquares is %d%n ", sumOfSquares);

    int differenceOfSquares = squareOfFirstNumber - squareOfSecondNumber;
    System.out.printf("The differenceOfSquares is %d%n " ,differenceOfSquares);






 }




}

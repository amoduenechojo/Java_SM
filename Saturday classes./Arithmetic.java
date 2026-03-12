import java.util.Scanner;
public class Arithmetic{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter firstNumber: ");
    int firstNumber = input.nextInt();

    System.out.print("Enter secondNumber: ");
    int secondNumber = input.nextInt();

    int squareOfFirstNumber = firstNumber * firstNumber;
    System.out.println(squareOfFirstNumber);

    int squareOfSecondNumber = secondNumber * secondNumber;
    System.out.println(squareOfSecondNumber);  

    int sumOfSquares = squareOfFirstNumber + squareOfSecondNumber;
    System.out.println(sumOfSquares);

    int differenceOfSquares = squareOfFirstNumber - squareOfSecondNumber;
    System.out.println(differenceOfSquares);






 }




}

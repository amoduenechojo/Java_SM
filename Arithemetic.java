import java.util.Scanner;
public class Arithemetic{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println ("Enter first integer ");
        int firstNumber = input.nextInt();
        System.out.println ("Enter second integer ");
        int secondNumber = input.nextInt();
        System.out.println ("Enter third integer ");
        int thirdNumber = input.nextInt();
        int product = firstNumber * secondNumber * thirdNumber;

        System.out.print("The product is:" + product);
 }
}

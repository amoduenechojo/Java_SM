import java.util.Scanner;
public class Comparison{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);     

    System.out.println("Enter an integer: ");
    int onlyNumber = input.nextInt();

    int squareOfOnlyNumber = onlyNumber * onlyNumber;
    
    if (squareOfOnlyNumber > 100)
    System.out.printf("%d is greater than 100 %n" , squareOfOnlyNumber);

    if (squareOfOnlyNumber < 100)
    System.out.printf("%d is less than 100 %n" , squareOfOnlyNumber);

    if (squareOfOnlyNumber == 100)
    System.out.printf("%d is equals to 100 %n", squareOfOnlyNumber);

    if (squareOfOnlyNumber != 100)
    System.out.printf("%d is not equals to 100 %n", squareOfOnlyNumber);



    }
}

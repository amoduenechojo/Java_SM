import java.util.Scanner;
public class Sum0fSquareOfNumbers{
    public static void main(String [] args){
   
    Scanner input = new Scanner(System.in);

    int number = 0;
    int sum = 0;

        for(int count = 0; count <= 10; count ++){
        System.out.print("Enter a number: ");
        number = input.nextInt();

        sum = number * number;
 }
    System.out.println(sum);
}
    }

import java.util.Scanner;
public class PositiveNumber{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    int number = 0;

    if (number <= 0){
        System.out.print("Enter a positive number: ");
        }

    int count = 0;
    while(number != 1){

    System.out.print("Enter a number: ");
    number = input.nextInt();

        if(number % 2 == 0){
        System.out.println(number);
        }

        else if(number % 2 != 0){
            number = number / 3;
            number = number + 1;
        System.out.println(number);
        }
    }


    }   
}

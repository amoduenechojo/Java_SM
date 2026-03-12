import java.util.Scanner;
public class TaskOne{
    public static void main(String [] args){
   
    Scanner input = new Scanner(System.in);

    int number = 10;  

    for(int count = 1; count <= 10; count ++){

    System.out.print("Enter a number: ");
    number = input.nextInt();

    if(number % 2 == 0){
    System.out.println("The even number is: " + number);          
        }
    }

    }
}

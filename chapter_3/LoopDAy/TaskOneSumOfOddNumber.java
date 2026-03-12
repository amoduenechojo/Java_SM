import java.util.Scanner;
public class TaskOneSumOfOddNumber{
    public static void main(String [] args){
   
    Scanner input = new Scanner(System.in);

    int number = 10;  
    int index = 0;

    for(int count = 1; count <= 10; count ++){

    System.out.print("Enter a number: ");
    number = input.nextInt();

    if(number % 2 != 0){
    System.out.println("The sum of the odd is: " + index); 
        index ++;         
        }
    }

    }
}

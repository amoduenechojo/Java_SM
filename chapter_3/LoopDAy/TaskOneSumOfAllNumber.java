import java.util.Scanner;
public class TaskOneSumOfAllNumber{
    public static void main(String [] args){
   
    Scanner input = new Scanner(System.in);

    int number = 0;
    int total = 0;

    for(int count = 0; count <= 10; count ++){
        System.out.print("Enter a number: ");
        number = input.nextInt();
//}
        total += number;
}

System.out.print("The sum of all numbers are: " + total);    



}
    }

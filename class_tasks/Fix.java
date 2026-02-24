import java.util.Scanner;
public class Fix{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if(number >= 1000){
            System.out.printf("%,d%n",number);
            }
            
            else if(number <= 999){
            System.out.println("$" + number);
            }

}
    }

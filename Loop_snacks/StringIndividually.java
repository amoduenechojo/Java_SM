import java.util.Scanner;
public class StringIndividually{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);     
3

        System.out.print("Enter a name: ");
        String name = input.nextLine();

        for(int number = 0; number < name.length(); number ++){
            System.out.println(name.charAt(number));
        }
 }
    }

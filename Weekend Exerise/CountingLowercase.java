import java.util.Scanner;
public class CountingLowercase{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a letter");
    String letter = input.nextLine();

    int value = 0;


    for(int count = 0; count< letter.length(); count++){
        char word = letter.charAt(count);
        if(Character.isLowercase(letter)){
            value ++;
        }
    }
    
         System.out.print("The number of lowercase in this word is: " + value);

}
    }

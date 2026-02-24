import java.util.Scanner;
public class CountingUppercase{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        int value = 0;
       Character;

        for(int count = 0; count < word.length(); count++){
            char letter = word.charAt(count);
                if (Character.isUppercase(letter)){
                    value++;
    }
        }
        System.out.print("The number of uppercase in this word is: " + value);
}
    }

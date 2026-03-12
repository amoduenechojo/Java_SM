import java.util.Scanner;

public class ReverseString{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        for (int reversedWord = word.length() - 1; reversedWord >= 0; reversedWord--) {
            System.out.println(word.charAt(reversedWord));
        }
    }
}

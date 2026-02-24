import java.util.Scanner;
public class CountingAlphabets{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String name = input.nextLine();

        int count = 0;
        int consonant = 0;

        for (int total = 0; total < name.length(); total++) {
            char checker = name.charAt(total);

            if (checker == 'a' || checker == 'e' || checker == 'i' || 
               checker == 'o' || checker == 'u') {
                count++;
            }
            else{
                    consonant++;

                    }
                
            }
        

        System.out.println("Number of vowels: " + count);
        System.out.println("Number of consonants: " + consonant);
    }
    }
//}


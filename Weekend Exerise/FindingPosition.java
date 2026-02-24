import java.util.Scanner;
    public class FindingPosition{
        public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();


        int position = -1;

        for(int number = 0; number < word.length(); number++){
            char letter = Character.toLowercase(word.charAt(number));
             if(letter == 'a'|| letter == 'e' || letter == 'i' || letter == 'o'|| letter == 'u'){
                position = number;
           }
    }

        if(position != -1){
            System.out.println("The postion of the first vowel is at: " + position);
        }
            else{
                System.out.println("No vowel found.");
                }










    }
        }

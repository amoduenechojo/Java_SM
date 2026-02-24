import java.util.Scanner;
    public class Lowercase{
        public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine();      
       
        String savedText = " ";
        
        for(int count = 0; count < text.length(); count ++){
            char letter = text.charAt(count);
    
            if(Character.isUpperCase(letter)){
                savedText= savedText + Character.toLowerCase(letter);
            }

            else{
          savedText = savedText + letter;
            }
        }
        System.out.println("The converted word is: " + savedText);

    }
        }

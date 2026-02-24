import java.util.Scanner;
    public class Uppercase{
        public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine();      
       
        String savedText = " ";
        
        for(int count = 0; count < text.length(); count ++){
            char letter = text.charAt(count);
    
            if(Character.isLowerCase(letter)){
                savedText= savedText + Character.toUpperCase(letter);
            }

            else{
          savedText = savedText + letter;
            }
        }
        System.out.println("The converted word is: " + savedText);

    }
        }

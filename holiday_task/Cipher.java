import java.util.Scanner;

    public class Cipher{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

                System.out.println("Enter a text: ");
                String text = input.nextLine();

                System.out.println("Enter a number: ");
                int number = input.nextInt();

                String encryptedText = " ";

                for (int i = 0; i < text.length(); i++) {
                char character = text.charAt(i);

                if (Character.isUpperCase(character)) {
                char shifted = (char) (((character - 'A' + number) % 26) + 'A');
                encryptedText = encryptedText + shifted;
            }


                else if (Character.isLowerCase(character)) {
                char shifted = (char) (((character - 'a' + number) % 26) + 'a');
                encryptedText = encryptedText + shifted;
            }


                else {
                encryptedText = encryptedText + character;
            }
        }


            System.out.println("Encrypted message: " + encryptedText);

    }
        }

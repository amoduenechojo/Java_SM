//import java.util.Scanner;
//public class ReverseWord{
//    public static void main(String [] args){
//        Scanner input = new Scanner(System.in);
//
//
//        System.out.print("Enter a word: ");
//        String word = input.nextLine();
//
//        for(int count = 5; count >= 0; count--){
//            System.out.println("Hello" + count);
//        }
//    }
//        }




//word.charAt()
//count


import java.util.Scanner;
public class ReverseWord{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a word: ");
    String word = input.nextLine();

    for(int count = word.length()-1; count >= 0; count --){
//        char letter = word.charAt(count);
//        System.out.println(count);
//        System.out.print(word.charAt(count)+ " ");
          System.out.print(word.charAt(count)+ " ");
          
    }

            System.out.println();     

}
    }   

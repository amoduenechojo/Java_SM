import java.util.Scanner;
public class Kashamadupe{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    String word = "KASHAMADUPE";
    int number = 0;
    int words = 0;
//    int spaces = 0;

     for(int line = 0; line <= word.length()-1; line++){
            for(int space = 0; space <= line; space ++){
                System.out.print(" ");
        }

//        for(int count = 0; count < word.length(); count++){
//            char letter = word.charAt(count);
//     
//           }     
                for(int index = line; index <= word.length()-1; index ++){
//                        char letter = words.charAt(index);        
                            System.out.print(word.charAt(index));
                    }
        //    }
               System.out.println();
        }
            }
}




//
//KASHAMADUPE
// ASHAMADUPE
//  SHAMADUPE 
//   HAMADUPE
//    AMADUPE 
//     MADUPE 
//      ADUPE 
//       DUPE  
//        UPE
//         PE
//          E 


        


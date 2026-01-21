import java.util.Scanner;
public class TaskOne{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    int [] scores = new int[10];
    System.out.println("Enter 10 scores: ");

    for(int score = 0; score< 10; score ++){
    System.out.print("Enter the scores: ");
    scores[score] = input.nextInt();    
    }
//
//    for(int scores:mark){
//    System.out.print(Arays.toSting(scores));
//    }

   }
}

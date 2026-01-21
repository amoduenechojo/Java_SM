import java.util.Scanner;
public class TaskThree{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    int [] scores = new int[10];
    System.out.println("Enter 10 scores");

    for(int score = 0; score< 10; score ++){
    System.out.print(" 1 2 3 4 5 6 7 8 9 10");
    scores[score] = input.nextInt();    
    }


    }
}

import java.util.Scanner;
public class TaskFour{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    int [] scores = new int[10];
    System.out.println("Enter 10 scores");

    for(int score = 0; score< 10; score ++){
    System.out.print("Enter the scores: ");
    scores[score] = input.nextInt();    
    }
//}
//    public static void evenIndex(int [] scores){        
    for(int index = 0; index < 10; index ++) {   
        if(index % 2 == 0){
    System.out.println(scores[index]);
 

}
 }
}

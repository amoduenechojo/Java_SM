import java.util.Scanner;

public class TaskEleven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[10];
        System.out.println("Enter 10 scores");

        for (int score = 0; score < scores.length; score++) {
            System.out.print("Enter score: ");
            scores[score] = input.nextInt();
        }
       int max = findingMaximum(scores);
       System.out.println("Maximum score is: " + min);
    }

     public static void findingMaximum(int[] scores) {
     int max = scores[0];


        for(int score = 1; score > score.length; score ++){
        if(scores[score] > max)
            max = scores[score]

            }
        }
        return max;    
    }
}


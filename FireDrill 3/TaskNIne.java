import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[10];
        System.out.println("Enter 10 scores");

        for (int score = 0; score < scores.length; score++) {
            System.out.print("Enter score: ");
            scores[i] = input.nextInt();
        }

       int min = findingMinimum(scores);
       System.out.println("Minimum score is: " + min);
    }

    public static int findingMinimumOfTaskNine(int[] scores) {
        int min = scores[0];

        for (int score = 1; score < scores.length; score++) {
            if (scores[score] < min) {
                min = scores[score];
            }
        }
        return min;
    }
}


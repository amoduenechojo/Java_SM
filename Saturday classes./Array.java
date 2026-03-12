//Write a program that collects the names and scores of five students. Print out the even scores. Calculate the sum of the scores, and the product of scores, and the average of scores..java
import java.util.Scanner;
public class Array{
    public static void main(String [] args){
    
     Scanner input = new Scanner(System.in);
        String [] studentNames = new String [5];

        for(int number = 0; number < 5; number++){
        System.out.printf("Enter student %s: ", studentNames, number + 1);
        String name = input.nextLine();

        studentNames[number] = name;
        }

//        int count = 0;        

        int [] studentScores = new int[5];
        for(int count = 0; count < 5; count ++){
            System.out.printf("Enter student %d: ", studentScores, count + 1);
            int score = input.nextInt();

            studentScores[count] = score;
        }


            if(studentScores[count]% 2 == 0){
            System.out.println("Odd number");
            }

                int sum = 0;

                for(int value = 0; value < studentScores.length; value++){
                    sum = sum + studentScores[count]; 
                }
                    System.out.println("The sum of the studentScores are: ");

                int product = 0;
                
                for(int multiple = 0; multiple < studentScores.length; multiple++){
                    product = product * studentScores[count]; 
                }
                    System.out.println("The product of the studentScores are: ");

                int average = 0;
                
                for(int numeric = 0; numeric < studentScores.length; numeric++){
                    average = studentScores[count]/5;
                }
                
                    System.out.println("The average of the studentScores are: ");




}
    }

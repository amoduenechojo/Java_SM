import java.util.Scanner;

public class StudentsGrade {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How many students do you have? ");
        int numberOfStudents = input.nextInt();

        System.out.print("How many subjects do they offer? ");
        int numberOfSubjects = input.nextInt();

        int[][] studentsGrade = new int[numberOfStudents][numberOfSubjects];

        collectScores(studentsGrade, numberOfStudents, numberOfSubjects);

        int[] total = studentTotalRecords(studentsGrade, numberOfStudents, numberOfSubjects);
        double[] average = studentAverageRecords(total, numberOfSubjects);
        int[] position = calculatePositions(total);

        studentTable(studentsGrade,total,average,position, numberOfStudents, numberOfSubjects);
        findHardestSubject(studentsGrade, numOfRows, numOfColumn);
        findEasiestSubject(studentsGrade, numOfRows, numOfColumn);
              
    }

    public static void collectScores(int[][] studentsGrade, int numberOfStudents, int numberOfSubjects) {

        for (int row = 0; row < numberOfStudents; row++) {

            System.out.println("\nEntering scores for Student " + (row + 1));

            for (int column = 0; column < numberOfSubjects; column++) {

                System.out.print("Subject " + (column + 1) + ": ");
                int score = input.nextInt();

                if (score >= 0 && score <= 100) {
                    studentsGrade[row][column] = score;
                } else {
                    System.out.println("Invalid score! Enter 0 - 100");
                    column--; 
                }
            }
        }
    }


    public static int[] studentTotalRecords(
            int[][] studentsGrade,
            int numberOfStudents,
            int numberOfSubjects) {

        int[] total = new int[numberOfStudents];

        for (int row = 0; row < numberOfStudents; row++) {
            int sum = 0;

            for (int column = 0; column < numberOfSubjects; column++) {
                sum += studentsGrade[row][column];
            }
            total[row] = sum;
        }
        return total;
    }



    public static double[] studentAverageRecords(int[] total, int numberOfSubjects) {

        double[] average = new double[total.length];

        for (int row = 0; row < total.length; row++) {
            average[row] = (double) total[row] / numberOfSubjects;
        }
        return average;
    }

   

    public static int[] calculatePositions(int[] total) {

        int[] position = new int[total.length];

        for (int row = 0; row < total.length; row++) {
            int  posOfStudent= 1;

            for (int column = 0; column < total.length; column++) {
                if (total[column] > total[row]) {
                    posOfStudent++;
                }
            }
            position[row] =  posOfStudent;
        }
        return position;
    }

   

     public static void studentTable(int[][] studentsGrade, int[] total, double[] average, int[] position, int numberOfStudents, int numberOfSubjects) {
          
        System.out.println("\n===============================================================");
        System.out.print("STUDENT\t");

        for (int subject = 1; subject <= numberOfSubjects; subject++) {
            System.out.print("SUB" + subject + "\t");
        }

        System.out.println("TOTAL\tAVE\tPOS");
        System.out.println("===============================================================");

        for (int row = 0; row < numberOfStudents; row++) {

            System.out.print("Student " + (row + 1) + "\t");

            for (int column = 0; column < numberOfSubjects; column++) {
                System.out.print(studentsGrade[row][column] + "\t");
            }

            System.out.printf("%d\t%.2f\t%d%n", total[row], average[row], position[row]);
               
        }
    }

    
   
     public static void findHardestSubject(int[][] studentsGrade, int numOfRows, int numOfColumn) {
        int hardestSubjectIndex = 0;
        int maximumFailuresFound = -1;

        for (int column = 0; column < numOfColumn; column++) {
            int failureCount = 0; 
            for (int row = 0; row < numOfRows; row++) {
                if (studentsGrade[row][column] < 40) {
                    failureCount++;
                }
            }

            if (failureCount > maximumFailuresFound) {
                maximumFailuresFound = failureCount;
                hardestSubjectIndex = column + 1;
            }
        }
        System.out.println("The hardest subject is Subject " + hardestSubjectIndex + " with " + maximumFailuresFound + " failures");
    }

  

      public static void findEasiestSubject(int[][] studentsGrade, int numOfRows, int numOfColumn) {
        int easiestSubjectIndex = 0;
        int maximumPassesFound = -1;

        for (int column = 0; column < numOfColumn; column++) {
            int passCount = 0; 
            for (int row = 0; row < numOfRows; row++) {
                if (studentsGrade[row][column] >= 40) {
                    passCount++;
                }
            }

            if (passCount > maximumPassesFound) {
                maximumPassesFound = passCount;
                easiestSubjectIndex = column + 1;
            }
        }
        System.out.println("The easiest subject is Subject " + easiestSubjectIndex + " with " + maximumPassesFound + " passes");
    }
}

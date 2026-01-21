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
        findHardestSubject(studentsGrade, numberOfStudents, numberOfSubjects);
        findEasiestSubject(studentsGrade, numberOfStudents, numberOfSubjects);
    }

    public static void collectScores(int[][] studentsGrade, int numOfRows, int numOfColumn) {
        for (int row = 0; row < numOfRows; row++) {
            System.out.print("Entering score for student" + (row + 1)+ ":");
             int studentsStudent = input.nextInt();

 
            for (int column = 0; column < numOfColumn; column++) {
                System.out.print("Enter score for subject " + (column + 1)+ ":");
                int studentsScore = input.nextInt();
                
                if (studentsScore >= 0 & studentsScore <= 100) {
                    studentsGrade[row][column] = studentsScore;  
                    System.out.println("Saved successfully");
                } else {
                    System.out.println("Invalid! Enter 0-100.");
                    column--; 
                }
            }
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

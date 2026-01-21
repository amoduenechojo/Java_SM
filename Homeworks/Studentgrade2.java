//int[] totals = new int[numberOfStudents];
//int[] positions = new int[numberOfStudents];
//
// Assume totals are already calculated...
//
//for (int i = 0; i < numberOfStudents; i++) {
//    int rank = 1;
//    for (int j = 0; j < numberOfStudents; j++) {
//        // If-else logic to compare totals
//        if (totals[j] > totals[i]) {
//            rank++;
//        }
//    }
//    positions[i] = rank;
//}





import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.String);

  
        System.out.println("How many students do you have?");
        int numOfStudents = scanner.nextInt();
        System.out.println("How many subjects do they offer?");
        int numOfSubjects = scanner.nextInt();

        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        int[][] grades = new int[numOfStudents][numOfSubjects];

        for (int students = 0; students < numOfStudents; student++) {
            for (int subject = 0; subject < numOfSubjects; subject++) {
                int score;
                while (true) {
                    System.out.printf("Entering score for student %d%n", (i + 1));
                    System.out.printf("Enter score for subject %d%n", (j + 1));
                    score = scanner.nextInt();
                      if (score >= 0 && score <= 100) {
                        grades[i][j] = score;
                        System.out.println("Saved successfully");
                        break;
                    } else {
                        System.out.println("Invalid score! Must be between 0 and 100.");
                    }
                }
            }
        }

        // 4. Calculations for Table [cite: 59]
        int[] totals = new int[numOfStudents];
        double[] averages = new double[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            int sum = 0;
            for (int j = 0; j < numOfSubjects; j++) {
                sum += grades[i][j];
            }
            totals[i] = sum;
            averages[i] = (double) sum / numOfSubjects;
        }

        // 5. Positioning logic using If/Else [cite: 59]
        int[] positions = new int[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            int rank = 1;
            for (int j = 0; j < numOfStudents; j++) {
                if (totals[j] > totals[i]) {
                    rank++;
                }
            }
            positions[i] = rank;
        }

        // 6. Display Table Output [cite: 59, 60]
        System.out.println("====================================================================================");
        System.out.print("STUDENT\t\t");
        for (int j = 1; j <= numOfSubjects; j++) System.out.print("SUB" + j + "\t");
        System.out.println("TOT\tAVE\tPOS");
        System.out.println("====================================================================================");

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < numOfSubjects; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.printf("%d\t%.2f\t%d%n", totals[i], averages[i], positions[i]);
        }
        System.out.println("====================================================================================");

        // 7. Subject Summary Logic [cite: 66, 67, 73, 79]
        System.out.println("\nSUBJECT SUMMARY");
        int overallHighest = -1, highStudent = 0, highSub = 0;
        int overallLowest = 101, lowStudent = 0, lowSub = 0;
        int hardestSub = 0, maxFails = -1;
        int easiestSub = 0, maxPasses = -1;

        for (int j = 0; j < numOfSubjects; j++) {
            int subTotal = 0, passes = 0, fails = 0;
            int subMax = -1, subMaxStudent = 0;
            int subMin = 101, subMinStudent = 0;

            for (int i = 0; i < numOfStudents; i++) {
                int score = grades[i][j];
                subTotal += score;

                // Pass/Fail (Assume 50 is pass) [cite: 72, 82, 83]
                if (score >= 50) passes++; else fails++;

                // Local Max/Min [cite: 68, 71]
                if (score > subMax) { subMax = score; subMaxStudent = i + 1; }
                if (score < subMin) { subMin = score; subMinStudent = i + 1; }

                // Overall Max/Min [cite: 94]
                if (score > overallHighest) { overallHighest = score; highStudent = i + 1; highSub = j + 1; }
                if (score < overallLowest) { overallLowest = score; lowStudent = i + 1; lowSub = j + 1; }
            }

            System.out.println("Subject " + (j + 1));
            System.out.printf("Highest scoring student is: Student %d scoring %d%n", subMaxStudent, subMax);
            System.out.printf("Lowest scoring student is: Student %d scoring %d%n", subMinStudent, subMin);
            System.out.println("Total Score is: " + subTotal);
            System.out.printf("Average score is: %.2f%n", (double) subTotal / numOfStudents);
            System.out.println("Number of passes: " + passes);
            System.out.println("Number of Fails: " + fails + "\n");

            // Hardest/Easiest logic [cite: 92, 93]
            if (fails > maxFails) { maxFails = fails; hardestSub = j + 1; }
            if (passes > maxPasses) { maxPasses = passes; easiestSub = j + 1; }
        }

        // 8. Class Summary [cite: 95]
        int bestStudent = 0, worstStudent = 0;
        int maxTotal = -1, minTotal = 10000, classTotal = 0;

        for (int i = 0; i < numOfStudents; i++) {
            classTotal += totals[i];
            if (totals[i] > maxTotal) { maxTotal = totals[i]; bestStudent = i + 1; }
            if (totals[i] < minTotal) { minTotal = totals[i]; worstStudent = i + 1; }
        }

        System.out.println("The hardest subject is Subject " + hardestSub + " with " + maxFails + " failures"); [cite: 92]
        System.out.println("The easiest subject is Subject " + easiestSub + " with " + maxPasses + " passes"); [cite: 93]
        System.out.printf("The overall Highest score is scored by Student %d in subject %d scoring %d%n", highStudent, highSub, overallHighest); [cite: 94]
        System.out.printf("The overall Lowest score is scored by Student %d in subject %d scoring %d%n", lowStudent, lowSub, overallLowest); [cite: 94]
        
        System.out.println("====================================================================================");
        System.out.println("CLASS SUMMARY");
        System.out.printf("Best Graduating Student is: Student %d scoring %d%n", bestStudent, maxTotal); [cite: 96]
        System.out.println("................................");
        System.out.printf("Worst Graduating Student is: Student %d scoring %d%n", worstStudent, minTotal); [cite: 99]
        System.out.println("Class total score is: " + classTotal); [cite: 100]
        System.out.printf("Class Average score is: %.1f%n", (double) classTotal / numOfStudents); [cite: 101]
        System.out.println("====================================================================================");
    }
}

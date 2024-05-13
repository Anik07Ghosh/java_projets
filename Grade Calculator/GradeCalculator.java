import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + (averagePercentage * 100) + "%");

        // Grade Calculation
        char grade;
        if (averagePercentage >= 0.9) {
            grade = 'A';
        } else if (averagePercentage >= 0.8) {
            grade = 'B';
        } else if (averagePercentage >= 0.7) {
            grade = 'C';
        } else if (averagePercentage >= 0.6) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

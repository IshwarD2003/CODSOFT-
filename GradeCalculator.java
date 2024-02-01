import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int subjects = 0;
        int totalMarks = 0;

        while (true) {
            System.out.print("Subject " + (subjects + 1) + ": ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
            } else {
                totalMarks += marks;
                subjects++;

                System.out.print("Do you have more subjects? (yes/no): ");
                String moreSubjects = scanner.next().toLowerCase();

                if (moreSubjects.equals("no")) {
                    break;
                }
            }
        }

        
        System.out.println("Total Marks: " + totalMarks);

        
        double averagePercentage = (double) totalMarks / subjects;
        System.out.println("Average Percentage: " + averagePercentage + "%");

        
        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
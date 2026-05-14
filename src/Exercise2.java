import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner reader = new Scanner(System.in);

        // Variables
        double gpa = 3.8; // Hard-coded GPA for the Honor Roll check
        char letterGrade;

        // Prompt the user
        System.out.print("Enter your numeric score: ");
        double score = reader.nextDouble();

        // Logic to determine Letter Grade
        if (score >= 90) {
            letterGrade = 'A';
        } else if (score >= 80) {
            letterGrade = 'B';
        } else if (score >= 70) {
            letterGrade = 'C';
        } else if (score >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // Output Results
        System.out.println("\nScore: " + score);
        System.out.println("Grade: " + letterGrade);
        System.out.println(""); // Formatting space

        // Evaluation Logic
        if (letterGrade != 'F') {
            // Nested if for Honor Roll
            if (score >= 90 && gpa >= 3.5) {
                System.out.println("Congratulations! You made the Honor Roll.");
            }
            System.out.println("Keep working hard to improve!");
            System.out.println("Good job!");
        } else {
            // Else block for failing grades
            System.out.println("Don't be discouraged! Seek help from your teacher and try again.");
        }

        // Close the scanner
        reader.close();
    }
}
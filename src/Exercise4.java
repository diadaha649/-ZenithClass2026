import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Student ID Validation ---
        String studentId = "";
        int idAttempts = 0;
        boolean idValid = false;

        while (!idValid) {
            idAttempts++;
            System.out.print("Enter a 6-digit Student ID: ");
            studentId = input.nextLine();

            // Check if input is numeric and exactly 6 digits long
            if (studentId.matches("\\d{6}")) {
                idValid = true;
            } else {
                System.out.println("Invalid input. Please ensure it is exactly 6 digits.");
            }
        }

        // --- Quiz Score Validation ---
        int score = -1;
        int scoreAttempts = 0;
        boolean scoreValid = false;

        while (!scoreValid) {
            scoreAttempts++;
            System.out.print("Enter a quiz score (0-100): ");

            if (input.hasNextInt()) {
                score = input.nextInt();
                if (score >= 0 && score <= 100) {
                    scoreValid = true;
                } else {
                    System.out.println("Score must be between 0 and 100.");
                }
            } else {
                System.out.println("Please enter a valid whole number.");
                input.next(); // Clear the invalid non-integer input
            }
        }

        // --- Final Output ---
        System.out.println("\n--- Validation Results ---");
        System.out.println("Student ID: " + studentId + " (Attempts: " + idAttempts + ")");
        System.out.println("Quiz Score: " + score + " (Attempts: " + scoreAttempts + ")");

        input.close();
    }
}
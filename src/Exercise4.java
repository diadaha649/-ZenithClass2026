import java.util.Scanner;
public class Exercise4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String studentId="";
        int idAttempts =0;
        boolean idValid = false;
        while (!idValid) {
            idAttempts++;
            System.out.print("Enter a 6-digit Student ID:");
            studentId = input.nextLine();
            if (studentId.matches("\\d{6}")) {
                idValid = true;
            } else {
                System.out.println("Invalid input. Please ensure it is exactly 6.");
            }
        }
        int score = -1;
        int scoreAttempts = 0;
        boolean scoreValid = false;
        while (!scoreValid){
            scoreAttempts++;
            System.out.print("Enter a quiz score (0-100):");
            if (input.hasNextInt())) {
    score = input.nextInt();
    if (score >=)
            }
        }
    }
}
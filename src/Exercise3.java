import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter graduation year: ");
        int graduationYear = scanner.nextInt();
        scanner.nextLine();

        int currentYear = java.time.Year.now().getValue();
        int yearsUntilGrad = graduationYear - currentYear;

        System.out.println("\nWelcome, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You will graduate in " + yearsUntilGrad + " years.");


    }
}
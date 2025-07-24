import java.util.Scanner;

public class VoterApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to E-Portal");

        // Ask for user's name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Ask for user's age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility
        System.out.println("\nHello " + name + "!");

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}
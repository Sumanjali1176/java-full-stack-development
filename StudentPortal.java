import java.util.Scanner;

public class StudentPortal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rise Engineering College");
        System.out.println("Please register with your details.");

        System.out.print("Enter your Roll Number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        int[] marks = new int[6];
        int totalMarks = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double percentage = (totalMarks / 600.0) * 100;  // Each subject out of 100
        String grade;

        if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else {
            grade = "Please improve your skills";
        }

        // Output
        System.out.println("\n--- Student Report ---");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks + " / 600");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Your Grade: " + grade);

        scanner.close();
    }
}
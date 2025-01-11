import java.util.Scanner;

// Class to determine voting eligibility based on age
public class VotingEligibilityChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        // Taking input for the ages of the students
        System.out.println("Please enter the ages of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            studentAges[i] = scanner.nextInt();
        }

        // Validate and check voting eligibility for each student
        for (int age : studentAges) {
            // Check for invalid age
            if (age < 0) {
                System.out.println("Invalid age entered.");
            // Check if the student is eligible to vote
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            // If the student is not eligible to vote
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        // Close the Scanner object
        scanner.close();
    }
}

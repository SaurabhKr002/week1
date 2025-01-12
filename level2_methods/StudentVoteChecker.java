import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        // Validate the age for a negative number
        if (age < 0) {
            return false;
        }

        // Check if the age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Array to store the age of 10 students
        int[] ages = new int[10];

        // Loop to take user input for the student's age
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Loop to check if each student can vote and display the result
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): " + (canVote ? "Can vote" : "Cannot vote"));
        }

        // Close the Scanner object
        scanner.close();
    }
}

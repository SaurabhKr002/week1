import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Define the number of students
        int numberOfStudents = 10;
        
        // Get random ages for the students
        int[] ages = generateRandomAges(numberOfStudents);
        
        // Determine voting eligibility for the students
        String[][] votingEligibility = checkVotingEligibility(ages);
        
        // Display the result in a tabular format
        displayVotingEligibility(votingEligibility);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to generate random 2-digit ages for the given number of students
    public static int[] generateRandomAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];
        
        // Generate random ages between 10 and 99
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(90) + 10;
        }
        
        return ages;
    }

    // Method to check voting eligibility based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] votingEligibility = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            votingEligibility[i][0] = String.valueOf(age);
            
            // Validate the age and determine voting eligibility
            if (age < 0) {
                votingEligibility[i][1] = "Cannot Vote";
            } else if (age >= 18) {
                votingEligibility[i][1] = "Can Vote";
            } else {
                votingEligibility[i][1] = "Cannot Vote";
            }
        }
        
        return votingEligibility;
    }

    // Method to display the voting eligibility in a tabular format
    public static void displayVotingEligibility(String[][] votingEligibility) {
        System.out.printf("%-10s%-15s%n", "Age", "Voting Eligibility");
        for (String[] entry : votingEligibility) {
            System.out.printf("%-10s%-15s%n", entry[0], entry[1]);
        }
    }
}

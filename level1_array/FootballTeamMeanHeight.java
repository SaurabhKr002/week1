import java.util.Scanner;

// Class to calculate the mean height of players in a football team
public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize an array to store the heights of 11 players and a variable to keep the total sum
        double[] heights = new double[11];
        double totalSum = 0.0;

        // Taking input for the heights of 11 players
        System.out.println("Enter the heights of 11 players in the team:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
            totalSum += heights[i];
        }

        // Calculate and display the mean height
        double meanHeight = totalSum / heights.length;
        System.out.println("The mean height of the football team is: " + meanHeight);

        // Close the Scanner object
        scanner.close();
    }
}

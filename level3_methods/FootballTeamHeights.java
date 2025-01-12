import java.util.*;

public class FootballTeamHeights {

    // Method to find the sum of all elements present in the array
    public static int findSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Method to find the mean height of the players on the football team
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height of the players on the football team
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height of the players on the football team
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the heights of 11 players
        int[] heights = new int[11];

        // Taking user input for the heights of the players
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter the height (in cm) of player " + (i + 1) + ": ");
            heights[i] = scanner.nextInt();
        }

        // Find the sum, mean, shortest, and tallest heights
        int sum = findSum(heights);
        double meanHeight = findMeanHeight(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);

        // Display the results
        System.out.println("\nHeights of players: " + Arrays.toString(heights));
        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + meanHeight);
        System.out.println("Shortest height: " + shortestHeight);
        System.out.println("Tallest height: " + tallestHeight);

        // Close the Scanner object
        scanner.close();
    }
}

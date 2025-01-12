import java.util.Scanner;

public class FriendComparison {

    // Method to find the youngest of the 3 friends
    public static String findYoungest(String[] names, int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return names[youngestIndex];
    }

    // Method to find the tallest of the 3 friends
    public static String findTallest(String[] names, double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return names[tallestIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store the names, ages, and heights of the 3 friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input for the ages and heights of the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter the height of " + names[i] + " in meters: ");
            heights[i] = scanner.nextDouble();
        }

        // Finding the youngest and tallest friends
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        // Displaying the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        // Close the Scanner object
        scanner.close();
    }
}

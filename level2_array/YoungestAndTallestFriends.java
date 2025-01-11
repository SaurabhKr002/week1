import java.util.Scanner;

// Class to find the youngest and tallest friends among Amar, Akbar, and Anthony
public class YoungestAndTallestFriends {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input ages and heights for each friend
        System.out.println("Enter the age and height for each friend:");
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + " - Age: ");
            ages[i] = scanner.nextInt();
            System.out.print(names[i] + " - Height: ");
            heights[i] = scanner.nextDouble();
        }

        // Determine the youngest and tallest among the friends
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output the results
        System.out.println("\nThe youngest friend is: " + names[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex]);

        // Close the Scanner object
        scanner.close();
    }
}

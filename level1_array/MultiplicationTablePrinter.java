import java.util.Scanner;

// Class to print the multiplication table of a given number
public class MultiplicationTablePrinter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Initialize an array to store multiplication results
        int[] multiplicationResults = new int[10];

        // Calculate multiplication table and store in array
        for (int i = 1; i <= 10; i++) {
            multiplicationResults[i - 1] = number * i;
        }

        // Display the multiplication table
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 0; i < multiplicationResults.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResults[i]);
        }

        // Close the Scanner object
        scanner.close();
    }
}

import java.util.Scanner;

// Class to implement the FizzBuzz game
public class FizzBuzzGame {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Initialize a String array to store the results
        String[] results = new String[number + 1];

        // Loop for FizzBuzz logic and save results in the array
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results
        System.out.println("FizzBuzz results:");
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close the Scanner object
        scanner.close();
    }
}

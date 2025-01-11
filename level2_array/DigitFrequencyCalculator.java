import java.util.Scanner;

// Class to find the frequency of each digit in a number
public class DigitFrequencyCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize an array to store the frequency of digits
        int[] frequency = new int[10];

        // Count the frequency of digits
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Display digit frequencies
        System.out.println("Digit frequencies in the given number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        // Close the Scanner object
        scanner.close();
    }
}

import java.util.Scanner;

// Class to reverse a number by storing its digits in an array
public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count the digits in the number
        int count = 0, temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Initialize an array to store the digits
        int[] digits = new int[count];
        int index = 0;

        // Store digits in the array
        while (number > 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Display the digits in reverse order
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        // Close the Scanner object
        scanner.close();
    }
}

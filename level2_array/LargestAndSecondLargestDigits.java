import java.util.Scanner;

// Class to find the largest and second largest digits of a number
public class LargestAndSecondLargestDigits {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize an array to store the digits and a variable to track the array index
        int[] digits = new int[10];
        int index = 0;

        // Store digits in the array
        while (number > 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Find the largest and second largest digits
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Close the Scanner object
        scanner.close();
    }
}

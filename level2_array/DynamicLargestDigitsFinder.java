import java.util.Scanner;

// Class to find the largest and second largest digits of a number with dynamic array resizing
public class DynamicLargestDigitsFinder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize variables to store digits and manage dynamic resizing
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits in dynamic array
        while (number > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
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

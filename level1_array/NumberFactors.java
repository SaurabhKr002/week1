import java.util.Scanner;

// Class to find the factors of a number and store them in an array
public class NumberFactors {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        
        // Initialize the array to store factors and necessary variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number and store in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Close the Scanner object
        scanner.close();
    }
}

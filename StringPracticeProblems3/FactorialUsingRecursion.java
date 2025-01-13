import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        // Read the input number from the user
        int number = getInputNumber();
        
        // Calculate the factorial using a recursive function
        long factorial = calculateFactorial(number);
        
        // Display the result
        displayResult(number, factorial);
    }

    // Function to read the input number from the user
    public static int getInputNumber() {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        // Close the Scanner object
        scanner.close();
        return number;
    }

    // Recursive function to calculate the factorial of a number
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return num * calculateFactorial(num - 1); // Recursive case
    }

    // Function to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

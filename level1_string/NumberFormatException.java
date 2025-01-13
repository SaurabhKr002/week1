import java.util.Scanner;

public class NumberFormatException {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        // Read the input string using nextLine() method
        String inputString = scanner.nextLine();
        
        // Call the method to generate the NumberFormatException
        try {
            generateNumberFormatException(inputString);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("NumberFormatException caught in main: " + e.getMessage());
        }

        // Call the method to handle the NumberFormatException
        handleNumberFormatException(inputString);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to generate a NumberFormatException
    public static void generateNumberFormatException(String text) {
        // Attempt to convert a non-numeric string to an integer
        int number = Integer.parseInt(text); // This line will throw a NumberFormatException
    }

    // Method to handle a NumberFormatException
    public static void handleNumberFormatException(String text) {
        // Try-catch block to handle the NumberFormatException
        try {
            // Attempt to convert a non-numeric string to an integer
            int number = Integer.parseInt(text);
        } catch (java.lang.NumberFormatException e) {
            // Handle the NumberFormatException and print a message
            System.out.println("NumberFormatException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other RuntimeException
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }
}

import java.util.Scanner;

public class StringIndexOutOfBoundsException {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        // Read the input string using nextLine() method
        String inputString = scanner.nextLine();
        
        // Call the method to generate the StringIndexOutOfBoundsException and handle it in main
        try {
            generateStringIndexOutOfBoundsException(inputString);
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught in main: " + e.getMessage());
        }

        // Call the method to handle the StringIndexOutOfBoundsException
        handleStringIndexOutOfBoundsException(inputString);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to generate a StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String str) {
        // Attempt to access an index beyond the length of the string
        char ch = str.charAt(str.length() + 1); // This line will throw a StringIndexOutOfBoundsException
    }

    // Method to handle a StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String str) {
        // Try-catch block to handle the StringIndexOutOfBoundsException
        try {
            // Attempt to access an index beyond the length of the string
            char ch = str.charAt(str.length() + 1);
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Handle the exception and print a message
            System.out.println("StringIndexOutOfBoundsException handled: " + e.getMessage());
        }
    }
}

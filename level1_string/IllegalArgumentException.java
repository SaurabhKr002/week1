import java.util.Scanner;

public class IllegalArgumentException{

    // Method for generating IllegalArgumentException
    public static void generatedIllegalArgumentException(String text) {
        
		// Trying to call substring() with start index greater than end index
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handledIllegalArgumentException(String text) {
        try {
            
			// Attempt to call substring() with start index greater than end index
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            
			// Handle IllegalArgumentException specifically
            System.out.println("An IllegalArgumentException occurred: " + e.getMessage());
        } catch (RuntimeException runtimeException) {
         
			System.out.println("RuntimeException caught: An unexpected error occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = sc.next();

        // Calling the method that generates the exception
        System.out.println("Demonstrating IllegalArgumentException generation:");
        try {
			
            generatedIllegalArgumentException(inputString);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        // Calling the method that handles the exception
        System.out.println("\nDemonstrating IllegalArgumentException handling:");
        handledIllegalArgumentException(inputString);

        sc.close();
    }
}

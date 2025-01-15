import java.util.Scanner;

public class StringLengthFinder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        // Read the input string using next() method
        String inputString = scanner.next();
        
        // Get the length of the string using the user-defined method
        int userDefinedLength = findLengthWithoutLengthMethod(inputString);
        
        // Get the length of the string using the built-in length() method
        int builtInLength = inputString.length();
        
        // Print the results
        System.out.println("Length using user-defined method: " + userDefinedLength);
        System.out.println("Length using built-in length() method: " + builtInLength);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to find and return the length of a string without using the length() method
    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                // Increment count for each character in the string
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates end of string, so return the count
            return count;
        }
    }
}

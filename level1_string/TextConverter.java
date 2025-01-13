import java.util.Scanner;

public class TextConverter {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        // Read the complete input string using nextLine() method
        String inputString = scanner.nextLine();
        
        // Convert the input string to uppercase using the built-in method
        String upperCaseStringBuiltIn = inputString.toUpperCase();
        
        // Convert the input string to uppercase using the user-defined method
        String upperCaseStringCustom = convertToUpperCase(inputString);
        
        // Compare the two strings using the user-defined method
        boolean areEqual = compareStrings(upperCaseStringBuiltIn, upperCaseStringCustom);
        
        // Display the results
        System.out.println("Uppercase using built-in method: " + upperCaseStringBuiltIn);
        System.out.println("Uppercase using custom method: " + upperCaseStringCustom);
        System.out.println("Are the two uppercase strings equal? " + areEqual);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to convert each character to uppercase using charAt() and ASCII values
    public static String convertToUpperCase(String text) {
        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Iterate over each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Check if the character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase by subtracting 32
                ch = (char) (ch - 32);
            }
            
            // Append the character to the result
            result.append(ch);
        }
        
        return result.toString();
    }

    // Method to compare two strings using charAt() and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Iterate over each character in the strings
        for (int i = 0; i < str1.length(); i++) {
            // Compare characters at the same position in both strings
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any characters don't match
            }
        }
        
        return true; // Return true if all characters match
    }
}

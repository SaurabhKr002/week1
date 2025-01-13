import java.util.Scanner;

public class CharArrayComparison {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        // Read the input string using next() method
        String inputString = scanner.next();
        
        // Get the character array using the user-defined method
        char[] userDefinedCharArray = getCharsUsingMethod(inputString);
        
        // Get the character array using the built-in toCharArray() method
        char[] builtInCharArray = inputString.toCharArray();
        
        // Compare the two character arrays
        boolean areEqual = compareCharArrays(userDefinedCharArray, builtInCharArray);
        
        // Print the results
        System.out.println("Character array using user-defined method: " + new String(userDefinedCharArray));
        System.out.println("Character array using toCharArray() method: " + new String(builtInCharArray));
        System.out.println("Comparison result: " + areEqual);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to return all characters in a string without using toCharArray()
    public static char[] getCharsUsingMethod(String str) {
        // Create an array of characters with the same length as the input string
        char[] charArray = new char[str.length()];
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Assign each character to the array
            charArray[i] = str.charAt(i);
        }
        
        // Return the character array
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        // Check if the lengths of the arrays are different
        if (array1.length != array2.length) {
            return false;
        }
        
        // Loop through each character in the arrays
        for (int i = 0; i < array1.length; i++) {
            // Compare characters at the same position in both arrays
            if (array1[i] != array2[i]) {
                return false; // Return false if any characters don't match
            }
        }
        
        return true; // Return true if all characters match
    }
}

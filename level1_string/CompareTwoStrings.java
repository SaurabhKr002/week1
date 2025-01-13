import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        // Read the first string using next() method
        String string1 = scanner.next();
        
        System.out.print("Enter the second string: ");
        // Read the second string using next() method
        String string2 = scanner.next();
        
        // Compare the two strings using charAt() method
        boolean comparisonResult = compareStringsUsingCharAt(string1, string2);
        
        // Use the built-in equals() method to compare the two strings
        boolean equalsResult = string1.equals(string2);
        
        // Print the results
        System.out.println("Comparison using charAt() method: " + comparisonResult);
        System.out.println("Comparison using equals() method: " + equalsResult);
        
        // Check if the results are the same
        if (comparisonResult == equalsResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Loop through each character in the strings
        for (int i = 0; i < str1.length(); i++) {
            // Compare characters at the same position in both strings
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any characters don't match
            }
        }
        
        return true; // Return true if all characters match
    }
}

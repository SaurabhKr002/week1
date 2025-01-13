import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        // Read the main string using next() method
        String mainString = scanner.next();
        
        System.out.print("Enter the start index: ");
        // Read the start index
        int startIndex = scanner.nextInt();
        
        System.out.print("Enter the end index: ");
        // Read the end index
        int endIndex = scanner.nextInt();
        
        // Create a substring using charAt() method
        String charAtSubstring = createSubstringUsingCharAt(mainString, startIndex, endIndex);
        
        // Create a substring using the built-in substring() method
        String builtInSubstring = mainString.substring(startIndex, endIndex);
        
        // Compare the two substrings using charAt() method
        boolean areEqual = compareStringsUsingCharAt(charAtSubstring, builtInSubstring);
        
        // Print the results
        System.out.println("Substring using charAt() method: " + charAtSubstring);
        System.out.println("Substring using substring() method: " + builtInSubstring);
        System.out.println("Comparison result: " + areEqual);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to create a substring using charAt() method
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
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

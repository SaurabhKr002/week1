import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        // Read the first string
        String string1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        // Read the second string
        String string2 = scanner.nextLine();
        
        // Compare the two strings lexicographically
        int result = compareStringsLexicographically(string1, string2);
        
        // Print the result of the comparison
        if (result < 0) {
            System.out.println("\"" + string1 + "\" is less than \"" + string2 + "\" lexicographically.");
        } else if (result > 0) {
            System.out.println("\"" + string1 + "\" is greater than \"" + string2 + "\" lexicographically.");
        } else {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\" lexicographically.");
        }
        
        // Close the Scanner object
        scanner.close();
    }
    
    // Method to compare two strings lexicographically
    public static int compareStringsLexicographically(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);
        
        // Loop through each character in the strings
        for (int i = 0; i < minLen; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            // Compare characters at the same position in both strings
            if (ch1 != ch2) {
                return ch1 - ch2; // Return the difference between the characters
            }
        }
        
        // If all characters are equal, compare the lengths of the strings
        return len1 - len2;
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        // Read the first string
        String string1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        // Read the second string
        String string2 = scanner.nextLine();
        
        // Check if the two strings are anagrams
        boolean areAnagrams = areAnagrams(string1, string2);
        
        // Print the result of the comparison
        if (areAnagrams) {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are not anagrams.");
        }
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

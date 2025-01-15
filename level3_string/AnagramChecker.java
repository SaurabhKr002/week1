import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        // Read the first input string using nextLine() method to include spaces
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        // Read the second input string using nextLine() method to include spaces
        String str2 = scanner.nextLine();
        
        // Check if the two strings are anagrams using the user-defined method
        boolean isAnagram = areAnagrams(str1, str2);
        
        // Display the result
        if (isAnagram) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove any spaces
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        
        // Check if lengths of the two strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Create arrays to store the frequency of characters in the strings
        int[] charCount1 = new int[256];
        int[] charCount2 = new int[256];
        
        // Loop through the first string to find the frequency of characters
        for (int i = 0; i < str1.length(); i++) {
            charCount1[str1.charAt(i)]++;
        }
        
        // Loop through the second string to find the frequency of characters
        for (int i = 0; i < str2.length(); i++) {
            charCount2[str2.charAt(i)]++;
        }
        
        // Compare the frequency of characters in the two strings
        for (int i = 0; i < 256; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }
        
        return true;
    }
}

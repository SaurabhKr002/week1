import java.util.Scanner;

public class StringTrimmer {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string with leading and trailing spaces: ");
        // Read the input string using nextLine() method
        String inputString = scanner.nextLine();
        
        // Get the start and end index after trimming leading and trailing spaces
        int[] trimIndices = getTrimIndices(inputString);
        
        // Get the trimmed substring using user-defined method
        String trimmedStringUserDefined = substringUsingCharAt(inputString, trimIndices[0], trimIndices[1]);
        
        // Get the trimmed string using the built-in trim() method
        String trimmedStringBuiltIn = inputString.trim();
        
        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedStringUserDefined, trimmedStringBuiltIn);
        
        // Display the results
        System.out.println("Trimmed string using user-defined method: '" + trimmedStringUserDefined + "'");
        System.out.println("Trimmed string using trim() method: '" + trimmedStringBuiltIn + "'");
        System.out.println("Comparison result: " + areEqual);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to get the start and end index for trimming leading and trailing spaces
    public static int[] getTrimIndices(String str) {
        int start = 0;
        int end = findLengthWithoutLengthMethod(str) - 1;
        
        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        
        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        return new int[] { start, end + 1 };
    }

    // Method to create a substring using charAt() method
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        
        // Append characters within the specified range to the substring
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        
        return substring.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        // Check if the lengths of the strings are different
        if (findLengthWithoutLengthMethod(str1) != findLengthWithoutLengthMethod(str2)) {
            return false;
        }
        
        // Loop through each character in the strings and compare
        for (int i = 0; i < findLengthWithoutLengthMethod(str1); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any characters don't match
            }
        }
        
        return true; // Return true if all characters match
    }

    // Method to find the length of the string without using the length() method
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

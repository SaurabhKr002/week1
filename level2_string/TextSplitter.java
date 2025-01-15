import java.util.Scanner;

public class TextSplitter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        // Read the input text using nextLine() method
        String inputText = scanner.nextLine();
        
        // Split the text into words using the user-defined method
        String[] userDefinedWords = splitTextUsingMethod(inputText);
        
        // Split the text into words using the built-in split() method
        String[] builtInWords = inputText.split(" ");
        
        // Compare the two word arrays
        boolean areEqual = compareWordArrays(userDefinedWords, builtInWords);
        
        // Print the results
        System.out.println("Words using user-defined method: " + String.join(", ", userDefinedWords));
        System.out.println("Words using split() method: " + String.join(", ", builtInWords));
        System.out.println("Comparison result: " + areEqual);
        
        // Close the Scanner object
        scanner.close();
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

    // Method to split the text into words without using the split() method
    public static String[] splitTextUsingMethod(String str) {
        int length = findLengthWithoutLengthMethod(str);
        
        // Count the number of words and store the indexes of spaces
        int wordCount = 1;
        int[] spaceIndexes = new int[length];
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[wordCount - 1] = i;
                wordCount++;
            }
        }
        
        // Create an array to store the words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int startIndex = 0;
        
        // Use the indexes to extract words
        for (int i = 0; i < wordCount; i++) {
            int endIndex = (i == wordCount - 1) ? length : spaceIndexes[i];
            words[i] = str.substring(startIndex, endIndex);
            startIndex = endIndex + 1;
        }
        
        return words;
    }

    // Method to compare two word arrays
    public static boolean compareWordArrays(String[] array1, String[] array2) {
        // Check if the lengths of the arrays are different
        if (array1.length != array2.length) {
            return false;
        }
        
        // Loop through each word in the arrays
        for (int i = 0; i < array1.length; i++) {
            // Compare words at the same position in both arrays
            if (!array1[i].equals(array2[i])) {
                return false; // Return false if any words don't match
            }
        }
        
        return true; // Return true if all words match
    }
}

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        // Read the input string using next() method
        String inputString = scanner.next();
        
        // Find the length of the text without using the String method length()
        int length = getLengthWithoutUsingLength(inputString);
        
        // Find the unique characters in the string using charAt() method
        char[] uniqueChars = findUniqueCharacters(inputString, length);
        
        // Display the result
        System.out.print("Unique characters in the string: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to find the length of the text without using the String method length()
    public static int getLengthWithoutUsingLength(String str) {
        int length = 0;
        try {
            while (str.charAt(length) != '\0') {
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception is thrown when accessing beyond the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String str, int length) {
        // Create an array to store the unique characters
        char[] tempUniqueChars = new char[length];
        int uniqueCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if the character is unique by comparing with previous characters
            for (int j = 0; j < i; j++) {
                if (currentChar == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, store it in the result array
            if (isUnique) {
                tempUniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Create a new array to store the exact number of unique characters
        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(tempUniqueChars, 0, uniqueChars, 0, uniqueCount);

        return uniqueChars;
    }
}

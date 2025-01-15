import java.util.Scanner;

public class UniqueCharacterFrequency {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        // Read the input string using nextLine() method to include spaces
        String inputString = scanner.nextLine();
        
        // Find the unique characters using the user-defined method
        char[] uniqueChars = findUniqueCharacters(inputString);
        
        // Find the frequency of characters using the user-defined method
        String[][] charFrequencies = findCharFrequencies(inputString, uniqueChars);
        
        // Display the result
        System.out.println("Character\tFrequency");
        for (String[] entry : charFrequencies) {
            if (entry[0] != null && !entry[0].equals(" ") && entry[1] != null) {
                System.out.println(entry[0] + "\t\t" + entry[1]);
            }
        }
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String str) {
        // Create an array to store the unique characters
        char[] tempUniqueChars = new char[str.length()];
        int uniqueCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
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

    // Method to find the frequency of characters in a string using unique characters
    public static String[][] findCharFrequencies(String str, char[] uniqueChars) {
        // Create an array to store the frequency of characters (256 ASCII characters)
        int[] charCount = new int[256];
        
        // Loop through the text to find the frequency of characters
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        
        // Create a 2D array to store the unique characters and their frequencies
        String[][] frequencies = new String[uniqueChars.length][2];
        
        // Loop through the unique characters and store the characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            frequencies[i][0] = Character.toString(uniqueChars[i]);
            frequencies[i][1] = Integer.toString(charCount[uniqueChars[i]]);
        }
        
        return frequencies;
    }
}

import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        // Read the input string using nextLine() method to include spaces
        String inputString = scanner.nextLine();
        
        // Find the frequency of characters using the user-defined method
        String[] charFrequencies = findCharFrequencies(inputString);
        
        // Display the result
        System.out.println("Character\tFrequency");
        for (String entry : charFrequencies) {
            if (entry != null) {
                System.out.println(entry);
            }
        }
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharFrequencies(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        
        // Create an array to store the frequency of characters
        int[] charCount = new int[charArray.length];
        
        // Outer loop to iterate through each character
        for (int i = 0; i < charArray.length; i++) {
            // Initialize the frequency of each character to 1
            charCount[i] = 1;
            
            // Skip already counted characters and spaces
            if (charArray[i] == '0' || charArray[i] == ' ') {
                continue;
            }
            
            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    charCount[i]++;
                    // Set duplicate characters to '0' to avoid counting them again
                    charArray[j] = '0';
                }
            }
        }
        
        // Create a 1D array to store the characters and their frequencies
        String[] frequencies = new String[charArray.length];
        int index = 0;
        
        // Loop through the characters and store the characters and their frequencies
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '0' && charArray[i] != ' ') {
                frequencies[index++] = charArray[i] + "\t\t" + charCount[i];
            }
        }
        
        return frequencies;
    }
}

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        // Read the input string using nextLine() method to include spaces
        String inputString = scanner.nextLine();
        
        // Find the first non-repeating character using the user-defined method
        char firstNonRepeatingChar = findFirstNonRepeatingChar(inputString);
        
        // Display the result
        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to find the first non-repeating character in a string using charAt() method
    public static char findFirstNonRepeatingChar(String str) {
        // Create an array to store the frequency of characters (256 ASCII characters)
        int[] charCount = new int[256];
        
        // Loop through the text to find the frequency of characters
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        
        // Loop through the text to find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i); // Return the first non-repeating character
            }
        }
        
        return '\0'; // Return null character if no non-repeating character is found
    }
}

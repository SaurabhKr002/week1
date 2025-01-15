import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        // Read the input string using nextLine() method to include spaces
        String inputString = scanner.nextLine();
        
        // Find the frequency of characters using the user-defined method
        String[][] charFrequencies = findCharFrequencies(inputString);
        
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

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharFrequencies(String str) {
        // Create an array to store the frequency of characters (256 ASCII characters)
        int[] charCount = new int[256];
        
        // Loop through the text to find the frequency of characters
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        
        // Create a 2D array to store the characters and their frequencies
        String[][] frequencies = new String[256][2];
        int index = 0;
        
        // Loop through the characters in the text and store the characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 0) {
                frequencies[index][0] = Character.toString((char) i);
                frequencies[index][1] = Integer.toString(charCount[i]);
                index++;
            }
        }
        
        // Trim the array to only include valid entries
        String[][] result = new String[index][2];
        System.arraycopy(frequencies, 0, result, 0, index);
        
        return result;
    }
}

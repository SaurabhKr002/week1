import java.util.Scanner;

public class VowelConsonantIdentifier {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        // Read the input string using nextLine() method
        String inputString = scanner.nextLine();
        
        // Find vowels and consonants in the string
        String[][] charTypes = findVowelsAndConsonants(inputString);
        
        // Display the result in a tabular format
        displayCharTypes(charTypes);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkVowelOrConsonant(char ch) {
        // Convert the character to lowercase if it is an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        
        // Check if the character is a consonant
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string and return the character types in a 2D array
    public static String[][] findVowelsAndConsonants(String str) {
        int length = findLengthWithoutLengthMethod(str);
        String[][] charTypes = new String[length][2];
        
        // Loop through each character in the string
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            charTypes[i][0] = String.valueOf(ch);
            charTypes[i][1] = checkVowelOrConsonant(ch);
        }
        
        return charTypes;
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

    // Method to display the 2D array of character types in a tabular format
    public static void displayCharTypes(String[][] charTypes) {
        System.out.printf("%-10s%-15s%n", "Character", "Type");
        for (String[] charType : charTypes) {
            System.out.printf("%-10s%-15s%n", charType[0], charType[1]);
        }
    }
}

import java.util.Scanner;

public class CountVowelsAndConsonants {
    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        // Convert character to lowercase
        ch = Character.toLowerCase(ch);
        // Check if it's a vowel
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // Read the input string
        String text = scanner.nextLine();

        // Initialize vowel count
        int vowelCount = 0;
        // Initialize consonant count
        int consonantCount = 0;

        // Loop through the characters in the string
        for (int i = 0; i < text.length(); i++) {
            // Get the current character
            char ch = text.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Print the result
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        // Close the Scanner object
        scanner.close();
    }
}

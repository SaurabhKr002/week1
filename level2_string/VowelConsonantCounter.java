import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        // Read the input string using nextLine() method
        String inputString = scanner.nextLine();
        
        // Get the count of vowels and consonants
        int[] counts = findVowelsAndConsonants(inputString);
        
        // Display the result
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
        
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

    // Method to find vowels and consonants in a string and return the count
    public static int[] findVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < findLengthWithoutLengthMethod(str); i++) {
            char ch = str.charAt(i);
            String result = checkVowelOrConsonant(ch);
            
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }
        
        return new int[] { vowelCount, consonantCount };
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

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        // Read the input sentence
        String sentence = scanner.nextLine();

        // Find the longest word in the sentence
        String longestWord = findLongestWord(sentence);
        // Print the longest word
        System.out.println("The longest word in the sentence is: " + longestWord);

        // Close the Scanner object
        scanner.close();
    }

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        // Initialize the longest word
        String longestWord = "";

        // Loop through the words to find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                // Update the longest word
                longestWord = word;
            }
        }

        // Return the longest word
        return longestWord;
    }
}

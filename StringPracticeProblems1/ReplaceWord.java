import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        // Read the input sentence
        String sentence = scanner.nextLine();
        
        System.out.print("Enter the word to replace: ");
        // Read the word to replace
        String oldWord = scanner.nextLine();
        
        System.out.print("Enter the new word: ");
        // Read the new word
        String newWord = scanner.nextLine();
        
        // Replace the old word with the new word in the sentence
        String modifiedSentence = sentence.replace(oldWord, newWord);
        
        // Print the modified sentence
        System.out.println("Modified sentence: " + modifiedSentence);
        
        // Close the Scanner object
        scanner.close();
    }
}

import java.util.*;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // Read the input string
        String input = scanner.nextLine();

        // Find the most frequent character
        char mostFrequentChar = findMostFrequentChar(input);
        // Print the result
        System.out.println("The most frequent character in the string is: " + mostFrequentChar);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentChar(String str) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            // Increment the frequency count for the character
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Initialize variables to store the most frequent character and its frequency
        char mostFrequentChar = str.charAt(0);
        int maxFrequency = 0;

        // Iterate through the HashMap to find the most frequent character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                // Update the most frequent character and its frequency
                mostFrequentChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Return the most frequent character
        return mostFrequentChar;
    }
}

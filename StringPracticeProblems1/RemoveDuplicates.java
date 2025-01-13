import java.util.Scanner;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // Read the input string
        String input = scanner.nextLine();

        // Remove duplicates from the input string
        String result = removeDuplicates(input);
        // Print the result
        System.out.println("String after removing duplicates: " + result);

        // Close the Scanner object
        scanner.close();
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        // Using LinkedHashSet to maintain the order of characters
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            // Add each character to the set (duplicates will be ignored)
            set.add(ch);
        }

        // Constructing the result string without duplicates
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            // Append each character to the result string
            sb.append(ch);
        }

        // Return the result string
        return sb.toString();
    }
}

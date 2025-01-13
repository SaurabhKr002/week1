import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        // Read the main string
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to search for: ");
        // Read the substring
        String substring = scanner.nextLine();

        // Count occurrences of the substring in the main string
        int count = countOccurrences(mainString, substring);
        // Print the result
        System.out.println("The substring \"" + substring + "\" occurs " + count + " times in the main string.");

        // Close the Scanner object
        scanner.close();
    }

    // Method to count occurrences of a substring in a string
    public static int countOccurrences(String mainString, String substring) {
        int count = 0;
        int fromIndex = 0;

        // Loop through the main string to find all occurrences of the substring
        while ((fromIndex = mainString.indexOf(substring, fromIndex)) != -1) {
            count++;
            fromIndex += substring.length(); // Move to the next position after the found substring
        }

        return count; // Return the total count
    }
}

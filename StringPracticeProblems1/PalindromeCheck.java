import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // Read the input string
        String input = scanner.nextLine();

        // Initialize flag to check if the string is a palindrome
        boolean isPalindrome = true;
        // Get the length of the string
        int length = input.length();

        // Loop through the string and check if characters from both ends match
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                // Set flag to false if characters don't match
                isPalindrome = false;
                // Exit the loop
                break;
            }
        }

        // Print the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
        
        // Close the Scanner object
        scanner.close();
    }
}

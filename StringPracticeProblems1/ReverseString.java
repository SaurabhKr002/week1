import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // Read the input string
        String input = scanner.nextLine();
        
        // Initialize an empty string to store the reversed string
        String reversedString = "";
        
        // Loop through the input string from the end to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversedString += input.charAt(i);
        }
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);
        
        // Close the Scanner object
        scanner.close();
    }
}

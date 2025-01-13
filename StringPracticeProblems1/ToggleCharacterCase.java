import java.util.Scanner;

public class ToggleCharacterCase {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // Read the input string
        String input = scanner.nextLine();

        // Initialize a StringBuilder to store the toggled string
        StringBuilder toggledString = new StringBuilder(input.length());

        // Loop through each character in the input string
        for (char ch : input.toCharArray()) {
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                // Convert to lowercase
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                // Convert to uppercase
                toggledString.append(Character.toUpperCase(ch));
            } else {
                // If it's neither, just append the character as is
                toggledString.append(ch);
            }
        }

        // Print the toggled string
        System.out.println("Toggled case string: " + toggledString.toString());

        // Close the Scanner object
        scanner.close();
    }
}

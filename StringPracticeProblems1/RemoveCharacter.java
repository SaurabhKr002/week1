import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // Read the input string
        String input = scanner.nextLine();
        
        System.out.print("Enter the character to remove: ");
        // Read the character to remove
        char charToRemove = scanner.next().charAt(0);

        // Remove the specified character from the string
        String result = removeCharacter(input, charToRemove);
        // Print the result
        System.out.println("String after removing '" + charToRemove + "': " + result);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String str, char charToRemove) {
        // Initialize a StringBuilder to construct the result string
        StringBuilder sb = new StringBuilder();
        
        // Loop through each character in the input string
        for (char ch : str.toCharArray()) {
            // Append the character to the StringBuilder if it is not the character to remove
            if (ch != charToRemove) {
                sb.append(ch);
            }
        }
        
        // Return the result string
        return sb.toString();
    }
}

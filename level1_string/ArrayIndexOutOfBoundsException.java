import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the number of names
        System.out.print("Enter the number of names: ");
        int numberOfNames = scanner.nextInt();
        
        // Create an array to store the names
        String[] names = new String[numberOfNames];
        
        // Read the names from user input
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        
        // Call the method to generate the ArrayIndexOutOfBoundsException
        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught in main: " + e.getMessage());
        }

        // Call the method to handle the ArrayIndexOutOfBoundsException
        handleArrayIndexOutOfBoundsException(names);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to generate an ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Attempt to access an index larger than the length of the array
        String name = names[names.length]; // This line will throw an ArrayIndexOutOfBoundsException
    }

    // Method to handle an ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        // Try-catch block to handle the ArrayIndexOutOfBoundsException
        try {
            // Attempt to access an index larger than the length of the array
            String name = names[names.length];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException and print a message
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other RuntimeException
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }
}

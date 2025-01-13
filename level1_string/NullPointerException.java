public class NullPointerException {

    public static void main(String[] args) {
        // Call the method to generate the NullPointerException and handle it in main
        try {
            generateNullPointerException();
        } catch (java.lang.NullPointerException e) {
            System.out.println("NullPointerException caught in main: " + e.getMessage());
        }

        // Call the method to handle the NullPointerException
        handleNullPointerException();
    }

    // Method to generate a NullPointerException
    public static void generateNullPointerException() {
        // Initialize the variable 'text' to null
        String text = null;

        // Attempt to call a method on the null variable to generate the exception
        int length = text.length(); // This line will throw a NullPointerException
    }

    // Method to handle a NullPointerException
    public static void handleNullPointerException() {
        // Initialize the variable 'text' to null
        String text = null;

        // Try-catch block to handle the NullPointerException
        try {
            // Attempt to call a method on the null variable
            int length = text.length();
        } catch (java.lang.NullPointerException e) {
            // Handle the exception and print a message
            System.out.println("NullPointerException handled: Variable 'text' is null.");
        }
    }
}

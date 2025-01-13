import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user to choose an operation
        System.out.print("Choose an operation (addition, subtraction, multiplication, division): ");
        String operation = scanner.next().toLowerCase();
        
        // Variable to store the result
        double result = 0;

        // Perform the chosen operation
        switch (operation) {
            case "addition":
                result = addition(num1, num2);
                break;
            case "subtraction":
                result = subtraction(num1, num2);
                break;
            case "multiplication":
                result = multiplication(num1, num2);
                break;
            case "division":
                result = division(num1, num2);
                break;
            default:
                System.out.println("Invalid operation. Please choose addition, subtraction, multiplication, or division.");
                scanner.close();
                return; // Exit the program for invalid operation
        }

        // Display the result
        System.out.println("The result is: " + result);
        
        // Close the Scanner object
        scanner.close();
    }

    // Function to perform addition
    public static double addition(double a, double b) {
        return a + b;
    }

    // Function to perform subtraction
    public static double subtraction(double a, double b) {
        return a - b;
    }

    // Function to perform multiplication
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Function to perform division
    public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}

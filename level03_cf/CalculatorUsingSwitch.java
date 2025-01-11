import java.util.Scanner;

class CalculatorUsingSwitch {
    public static void main(String[] args) {
		
		//Created scanner
        Scanner input = new Scanner(System.in);
		
		// Taking input for the first number
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();
		
		// Taking input for the second number
        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();
		
		// Taking input for the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = input.next();
		
		// Initialize validOperator to true
        double result = 0;
        boolean validOperator = true;

        // Using switch case to perform the desired operation based on the operator
        switch (op) {
            case "+":
                result = first + second; // Perform addition
                break;
            case "-":
                result = first - second; // Perform subtraction
                break;
            case "*":
                result = first * second; // Perform multiplication
                break;
            case "/":
                if (second != 0) {
                    result = first / second; // Perform division if second number is not zero
                } else {
                    System.out.println("Cannot divide by zero"); // Handle division by zero
                    validOperator = false; // Set validOperator to false for division by zero
                }
                break;
            default:
                validOperator = false; // Set validOperator to false for invalid operator
                System.out.println("Invalid Operator"); // Print invalid operator message
                break;
        }

        // Print the result if the operator is valid
        if (validOperator) {
            System.out.println("The result of " + first + " " + op + " " + second + " is: " + result);
        }
		
		// Scanner closed
        input.close();
    }
}
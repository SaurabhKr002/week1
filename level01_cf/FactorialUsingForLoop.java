import java.util.Scanner;

public class FactorialUsingForLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer");
        } else {
            // Compute factorial using a for loop
            int factorial = 1;

            for (int currMultiplier = 1; currMultiplier <= number; currMultiplier++) {
                factorial *= currMultiplier;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
		
		//closing input
        input.close();
    }
}

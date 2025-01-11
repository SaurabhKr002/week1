import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
		
		//Scanner created
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int PositiveNumber = input.nextInt();

        // Checking if the input is a positive number or not
        if (PositiveNumber <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            // Initialize the greatest factor
            int greatestFactor = 1;

            // Loop to find the greatest factor
            for (int i = PositiveNumber - 1; i >= 1; i--) {
                if (PositiveNumber % i == 0) {
                    greatestFactor = i;
                    break; // Getting out of the loop once the greatest factor is found
                }
            }

            // Printing the output
            System.out.println("The greatest factor of " + PositiveNumber + " besides itself is: " + greatestFactor);
        }
		
		//Scanner closed
        input.close();
    }
}

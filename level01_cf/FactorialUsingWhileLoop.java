import java.util.Scanner;

class FactorialUsingWhileLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Enter a positive integer.");
        } else {
            // Compute factorial using a while loop
            int factorial = 1;
            int currentMultiplier = 1;
			
			//while loop
            while (currentMultiplier <= number) {
                factorial *= currentMultiplier;
                currentMultiplier++;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }
		
		//closing input
        input.close();
    }
}

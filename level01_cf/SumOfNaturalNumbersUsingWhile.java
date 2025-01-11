import java.util.Scanner;

class SumOfNaturalNumbersUsingWhile{
    public static void main(String[] args) {
		
		//Scanner created
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number - ");
        int upperLimit = input.nextInt();

        // Check if the input is a natural number
        if (upperLimit <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            // Computing the sum using a while loop
            int sumUsingWhile = 0;
            int i = 1;
            while (i <= upperLimit) {
                sumUsingWhile += i;
                i++;
            }

            // Compute the sum using the formula
            int sumUsingFormula = upperLimit * (upperLimit + 1) / 2;

            // Display the results
            System.out.println("Sum using while loop: " + sumUsingWhile);
            System.out.println("Sum using formula: " + sumUsingFormula);

            // Compare the results
            if (sumUsingWhile == sumUsingFormula) {
                System.out.println("Both computations are correct and produce the same result");
            } else {
                System.out.println("Results are different");
            }
        }
		
		//Scanner closed
        input.close();
    }
}

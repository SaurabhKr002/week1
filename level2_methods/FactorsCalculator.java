import java.util.Scanner;

public class FactorsCalculator {

    // Method to find the factors of the number and save them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the sum of the factors using factors array
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using factors array
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of square of the factors using Math.pow()
    public static int findSumOfSquareOfFactors(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input for a number
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Finding the factors of the number
        int[] factors = findFactors(number);

        // Displaying the factors
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        // Finding and displaying the sum, sum of squares and product of the factors
        int sum = findSumOfFactors(factors);
        int product = findProductOfFactors(factors);
        int sumOfSquares = findSumOfSquareOfFactors(factors);

        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of square of factors: " + sumOfSquares);

        // Close the Scanner object
        sc.close();
    }
}

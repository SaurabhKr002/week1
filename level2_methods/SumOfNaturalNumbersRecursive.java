import java.util.Scanner;

public class SumOfNaturalNumbersRecursive {

    // Method to find the sum of n natural numbers using recursion
    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + findSumRecursive(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int findSumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input for the value of n
        System.out.println("Enter a natural number: ");
        int n = sc.nextInt();
        
        // Checking if the input is a natural number
        if (n <= 0) {
            System.out.println("Input is not a natural number.");
            return;
        }

        // Finding the sum using recursion
        int sumRecursive = findSumRecursive(n);
        
        // Finding the sum using the formula
        int sumFormula = findSumFormula(n);

        // Displaying the results
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        // Close the Scanner object
        sc.close();
    }
}

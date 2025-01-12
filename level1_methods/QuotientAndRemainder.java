import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder of a division
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for the number and divisor
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Finding the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Displaying the results
        System.out.println("The quotient is: " + result[0]);
        System.out.println("The remainder is: " + result[1]);

        // Close the Scanner object
        sc.close();
    }
}

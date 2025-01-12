import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using loop
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input for the value of n
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        // Calculating the sum of n natural numbers
        int sum = findSum(n);

        // Displaying the result
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        // Close the Scanner object
        sc.close();
    }
}

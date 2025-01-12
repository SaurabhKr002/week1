import java.util.Scanner;

public class DivideChocolates {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for the number of chocolates and children
        System.out.println("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.println("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Dividing the chocolates among children
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Displaying the results
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        // Close the Scanner object
        sc.close();
    }
}

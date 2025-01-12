import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for three numbers
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = sc.nextInt();

        // Finding the smallest and largest of the three numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Displaying the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        // Close the Scanner object
        sc.close();
    }
}

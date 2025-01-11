import java.util.Scanner;

// Class to determine the properties of user-inputted numbers and compare first and last elements
public class NumberAnalyzer {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        System.out.println("Please enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Check if numbers are positive, negative, or zero and determine if they are even or odd
        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number + " is positive and " + (number % 2 == 0 ? "even" : "odd"));
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] > numbers[4]) {
            System.out.println("The first element is greater than the last element.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("The last element is greater than the first element.");
        } else {
            System.out.println("The first and last elements are equal.");
        }

        // Close the Scanner object
        scanner.close();
    }
}

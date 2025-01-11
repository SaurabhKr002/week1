import java.util.Scanner;

// Class to store multiple values and calculate the sum
public class ValueStorer {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize an array to store values and a variable to keep the total sum
        double[] values = new double[10];
        double totalSum = 0.0;
        int index = 0;

        // Take input until a 0 or negative number is entered or the array reaches its maximum size
        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");
        while (true) {
            double number = scanner.nextDouble();
            if (number <= 0 || index == 10) {
                break;
            }
            values[index++] = number;
        }

        // Calculate the sum of the entered values
        for (int i = 0; i < index; i++) {
            totalSum += values[i];
        }

        // Display all entered values and the total sum
        System.out.println("You entered the following values:");
        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
        }
        System.out.println("Total sum: " + totalSum);

        // Close the Scanner object
        scanner.close();
    }
}

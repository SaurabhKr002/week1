// Importing Scanner class from util pkg for taking input 
import java.util.Scanner;
// Creating class for conversion from Fahrenheit to Celsius 
public class WeightConverter {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert weight to kilograms (1 pound = 2.2 kg)
        double weightInKilograms = weightInPounds / 2.2;

        // Display the result
        System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f%n",
                          weightInPounds, weightInKilograms);

        // Close the scanner
        scanner.close();
    }
}

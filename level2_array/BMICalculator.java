import java.util.Scanner;

// Class to calculate and display the BMI and weight status of individuals
public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Initialize arrays to store heights, weights, BMI, and weight status
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];

        // Input weight and height for each person
        System.out.println("Enter the height (in meters) and weight (in kg) for each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Person " + (i + 1) + " - Height: ");
            heights[i] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Weight: ");
            weights[i] = scanner.nextDouble();
        }

        // Calculate BMI and determine weight status for each person
        for (int i = 0; i < numPersons; i++) {
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }

        // Display height, weight, BMI, and weight status for each person
        System.out.println("\nBMI and Weight Status for each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + " -> Height: " + heights[i] + ", Weight: " + weights[i] + ", BMI: " + bmi[i] + ", Status: " + status[i]);
        }

        // Close the Scanner object
        scanner.close();
    }
}

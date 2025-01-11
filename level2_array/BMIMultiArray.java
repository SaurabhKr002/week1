import java.util.Scanner;

// Class to calculate and display the BMI and weight status of individuals using a multi-dimensional array
public class BMIMultiArray {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Initialize a multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        // Input weight and height for each person
        System.out.println("Enter the height (in meters) and weight (in kg) for each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Person " + (i + 1) + " - Height: ");
            personData[i][0] = scanner.nextDouble(); // Height
            System.out.print("Person " + (i + 1) + " - Weight: ");
            personData[i][1] = scanner.nextDouble(); // Weight
            
            // Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]); // BMI
            
            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display height, weight, BMI, and weight status for each person
        System.out.println("\nBMI and Weight Status for each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + " -> Height: " + personData[i][0] + ", Weight: " + personData[i][1] + ", BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }

        // Close the Scanner object
        scanner.close();
    }
}

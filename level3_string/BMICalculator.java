import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize a 2D array to store weight and height of 10 members
        double[][] heightWeight = new double[10][2];
        
        // Take user input for weight (in kg) and height (in cm) for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            heightWeight[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            heightWeight[i][1] = scanner.nextDouble();
        }
        
        // Compute BMI and status using the user-defined method
        String[][] bmiResults = computeBMIAndStatus(heightWeight);
        
        // Display the results
        displayResults(bmiResults);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to find the BMI and status of each person
    public static String[][] computeBMIAndStatus(double[][] heightWeight) {
        // Initialize a 2D array to store height, weight, BMI, and status
        String[][] results = new String[10][4];
        
        for (int i = 0; i < 10; i++) {
            double weight = heightWeight[i][0];
            double heightInMeters = heightWeight[i][1] / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            String status = getStatus(bmi);
            
            // Store height, weight, BMI, and status in the results array
            results[i][0] = String.valueOf(heightWeight[i][1]);
            results[i][1] = String.valueOf(weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        
        return results;
    }

    // Method to determine BMI status
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t\t%s\t\t%s\t\t%s\t\t%s\n", (i + 1), results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }
}

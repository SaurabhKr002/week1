import java.util.Scanner;

public class BMICalculator {

    // Method to calculate the BMI of a person
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // Convert height from cm to meters
        return weight / (heightM * heightM); // Calculate BMI
    }

    // Method to determine the BMI status
    public static String determineStatus(double bmi) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight, height, and BMI of 10 members
        double[][] data = new double[10][3];
        String[] statuses = new String[10];

        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and determine status for each person
        for (int i = 0; i < 10; i++) {
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            statuses[i] = determineStatus(data[i][2]);
        }

        // Display height, weight, BMI, and status for each person
        System.out.println("Height (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n", data[i][1], data[i][0], data[i][2], statuses[i]);
        }

        // Close the Scanner object
        scanner.close();
    }
}

import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    // Method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input for the angle in degrees
        System.out.println("Enter the angle (in degrees): ");
        double angle = sc.nextDouble();

        // Calculating trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Displaying the results
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        // Close the Scanner object
        sc.close();
    }
}

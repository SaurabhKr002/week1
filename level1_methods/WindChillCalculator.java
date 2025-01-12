import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for temperature and wind speed
        System.out.println("Enter the temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();
        System.out.println("Enter the wind speed (in miles per hour): ");
        double windSpeed = sc.nextDouble();

        // Calculating the wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);

        // Displaying the result
        System.out.println("The wind chill temperature is: " + windChill);

        // Close the Scanner object
        sc.close();
    }
}

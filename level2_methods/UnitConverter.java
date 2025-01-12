import java.util.Scanner;

public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double kilometers) {
        double km2miles = 0.621371;
        return kilometers * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for conversion choice
        System.out.println("Choose the conversion type:");
        System.out.println("1: Kilometers to Miles");
        System.out.println("2: Miles to Kilometers");
        System.out.println("3: Meters to Feet");
        System.out.println("4: Feet to Meters");
        int choice = scanner.nextInt();

        // Variables to store the input and result
        double inputValue, result;

        switch (choice) {
            case 1:
                // Kilometers to Miles
                System.out.print("Enter kilometers: ");
                inputValue = scanner.nextDouble();
                result = convertKmToMiles(inputValue);
                System.out.println(inputValue + " kilometers is equal to " + result + " miles");
                break;
            case 2:
                // Miles to Kilometers
                System.out.print("Enter miles: ");
                inputValue = scanner.nextDouble();
                result = convertMilesToKm(inputValue);
                System.out.println(inputValue + " miles is equal to " + result + " kilometers");
                break;
            case 3:
                // Meters to Feet
                System.out.print("Enter meters: ");
                inputValue = scanner.nextDouble();
                result = convertMetersToFeet(inputValue);
                System.out.println(inputValue + " meters is equal to " + result + " feet");
                break;
            case 4:
                // Feet to Meters
                System.out.print("Enter feet: ");
                inputValue = scanner.nextDouble();
                result = convertFeetToMeters(inputValue);
                System.out.println(inputValue + " feet is equal to " + result + " meters");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }
}

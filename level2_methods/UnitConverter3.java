import java.util.Scanner;

public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for conversion choice
        System.out.println("Choose the conversion type:");
        System.out.println("1: Fahrenheit to Celsius");
        System.out.println("2: Celsius to Fahrenheit");
        System.out.println("3: Pounds to Kilograms");
        System.out.println("4: Kilograms to Pounds");
        System.out.println("5: Gallons to Liters");
        System.out.println("6: Liters to Gallons");
        int choice = scanner.nextInt();

        // Variables to store the input and result
        double inputValue, result;

        switch (choice) {
            case 1:
                // Fahrenheit to Celsius
                System.out.print("Enter Fahrenheit: ");
                inputValue = scanner.nextDouble();
                result = convertFahrenheitToCelsius(inputValue);
                System.out.println(inputValue + " Fahrenheit is equal to " + result + " Celsius");
                break;
            case 2:
                // Celsius to Fahrenheit
                System.out.print("Enter Celsius: ");
                inputValue = scanner.nextDouble();
                result = convertCelsiusToFahrenheit(inputValue);
                System.out.println(inputValue + " Celsius is equal to " + result + " Fahrenheit");
                break;
            case 3:
                // Pounds to Kilograms
                System.out.print("Enter pounds: ");
                inputValue = scanner.nextDouble();
                result = convertPoundsToKilograms(inputValue);
                System.out.println(inputValue + " pounds is equal to " + result + " kilograms");
                break;
            case 4:
                // Kilograms to Pounds
                System.out.print("Enter kilograms: ");
                inputValue = scanner.nextDouble();
                result = convertKilogramsToPounds(inputValue);
                System.out.println(inputValue + " kilograms is equal to " + result + " pounds");
                break;
            case 5:
                // Gallons to Liters
                System.out.print("Enter gallons: ");
                inputValue = scanner.nextDouble();
                result = convertGallonsToLiters(inputValue);
                System.out.println(inputValue + " gallons is equal to " + result + " liters");
                break;
            case 6:
                // Liters to Gallons
                System.out.print("Enter liters: ");
                inputValue = scanner.nextDouble();
                result = convertLitersToGallons(inputValue);
                System.out.println(inputValue + " liters is equal to " + result + " gallons");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }
}

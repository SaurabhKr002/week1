import java.util.Scanner;

public class UnitConverterYtoF {

    // Method to convert yards to feet and return the value
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards and return the value
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches and return the value
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters and return the value
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters and return the value
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for conversion choice
        System.out.println("Choose the conversion type:");
        System.out.println("1: Yards to Feet");
        System.out.println("2: Feet to Yards");
        System.out.println("3: Meters to Inches");
        System.out.println("4: Inches to Meters");
        System.out.println("5: Inches to Centimeters");
        int choice = scanner.nextInt();

        // Variables to store the input and result
        double inputValue, result;

        switch (choice) {
            case 1:
                // Yards to Feet
                System.out.print("Enter yards: ");
                inputValue = scanner.nextDouble();
                result = convertYardsToFeet(inputValue);
                System.out.println(inputValue + " yards is equal to " + result + " feet");
                break;
            case 2:
                // Feet to Yards
                System.out.print("Enter feet: ");
                inputValue = scanner.nextDouble();
                result = convertFeetToYards(inputValue);
                System.out.println(inputValue + " feet is equal to " + result + " yards");
                break;
            case 3:
                // Meters to Inches
                System.out.print("Enter meters: ");
                inputValue = scanner.nextDouble();
                result = convertMetersToInches(inputValue);
                System.out.println(inputValue + " meters is equal to " + result + " inches");
                break;
            case 4:
                // Inches to Meters
                System.out.print("Enter inches: ");
                inputValue = scanner.nextDouble();
                result = convertInchesToMeters(inputValue);
                System.out.println(inputValue + " inches is equal to " + result + " meters");
                break;
            case 5:
                // Inches to Centimeters
                System.out.print("Enter inches: ");
                inputValue = scanner.nextDouble();
                result = convertInchesToCentimeters(inputValue);
                System.out.println(inputValue + " inches is equal to " + result + " centimeters");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }
}

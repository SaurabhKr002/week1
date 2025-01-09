// Importing Scanner class from util pkg for taking input 
import java.util.Scanner; 
// Creating class for conversion from Fahrenheit to Celsius 
public class TemperatureConversionFtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
    }
}

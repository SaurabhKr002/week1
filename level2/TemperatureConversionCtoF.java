// Importing Scanner class from util pkg for taking input 
import java.util.Scanner;
// Creating class for temperature conversions 
public class TemperatureConversionCtoF {
    public static void main(String[] args) {
//creating scanner class object input 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
	// creating a double type variable for celsius
        double celsius = input.nextDouble();
	// creating a double type variable for Fahrenheit 
        double fahrenheit = (celsius * 9 / 5) + 32;
	// Displaying the required conversions 
        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
    }
}

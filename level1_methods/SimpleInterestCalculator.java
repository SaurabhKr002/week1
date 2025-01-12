import java.util.*;
public class SimpleInterestCalculator {

    //Method to calculate Simple Interest and return the value
    public static double simpleInterest(double Principal,double Rate,double Time) {
        
        double simpleInterest = (Principal * Rate * Time) / 100;
		
		//return value
        return simpleInterest;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		//Taking user inputs of principal, rate, time
		System.out.println("Enter the Principal: ");
		double principal = sc.nextDouble();
		System.out.println("Enter the Rate : ");
		double rate = sc.nextDouble();		
		System.out.println("Enter the Time : ");
		double time = sc.nextDouble(); 
		
		//Calculating simple interest for the user inputs
		double result = simpleInterest(principal, rate, time);
		
		//Displaying the result
		System.out.println("The Simple Interest is "+result+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
		
        // Close the Scanner object
        sc.close();
    }
}

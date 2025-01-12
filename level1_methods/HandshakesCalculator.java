import java.util.*;
public class HandshakesCalculator {

    //Method to calculate handshakes and return the value
    public static int handshakes(int n) {
        
        int handshakes = (n * (n - 1)) / 2;
		
		//return value
        return handshakes;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		//Taking user inputs
		System.out.println("Enter the Number of Students: ");
		int numberOfStudents = sc.nextInt(); 
		
		//Calculating total number of handshakes for the user inputs
		int result = handshakes(numberOfStudents);
		
		//Displaying the result
		System.out.println("total number of handshakes: "+result);
		
        // Close the Scanner object
        sc.close();
    }
}

import java.util.*;
public class PossibleHandshakesCalculator {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		//Taking user inputs
		System.out.println("Enter the Number of Students: ");
		int numberOfStudents = sc.nextInt(); 
		
		//Calculating total number of possible handshakes for the user inputs
		int result = (numberOfStudents * (numberOfStudents-1) )/2 ;
		
		//Displaying the result
		System.out.println("total number of possibleHandshakes: "+result);
		
        // Close the Scanner object
        sc.close();
    }
}

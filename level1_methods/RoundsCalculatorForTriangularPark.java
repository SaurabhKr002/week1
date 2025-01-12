import java.util.*;
public class RoundsCalculatorForTriangularPark {

    //Method to calculate the rounds of the triangular park and return the value
    public static double roundsCalculate(int sideA,int sideB,int sideC,int distance) {
        
		//Calculating perimeter and number of rounds
        int perimeter = sideA+sideB+sideC;
		double rounds = distance/perimeter;
		
		//return value
        return rounds;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		//Taking user inputs
		System.out.println("Enter the side A: ");
		int sideA = sc.nextInt();
		System.out.println("Enter the side B: ");
		int sideB = sc.nextInt();
		System.out.println("Enter the side C: ");
		int sideC = sc.nextInt();
		System.out.println("Enter the distance to be covered: ");
		int distance = sc.nextInt();
		
		//Calculating total number of rounds for the user inputs
		double result = roundsCalculate(sideA,sideB,sideC,distance);
		
		//Displaying the result
		System.out.println("total number of rounds: "+result);
		
        // Close the Scanner object
        sc.close();
    }
}


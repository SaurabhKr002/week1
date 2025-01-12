import java.util.*;
public class NumberChecker {

    //Method to check if the the number is positive, negative or zero and return the value
    public static int checkNumber(int number) {
        
		int prefix;
		//Using control flow to get the value of the user inputs
        if(number>0){
			prefix=1;
		}
		else if(number<0){
			prefix=-1;
		}
		else{
			prefix=0;
		}
		//return value
        return prefix;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		//Taking user inputs
		System.out.println("Enter a  number: ");
		int number = sc.nextInt();
		
		//Storing the value of entered number in result variable
		int result = checkNumber(number);
		
		//Displaying the result
		System.out.println(result);
		
        // Close the Scanner object
        sc.close();
    }
}


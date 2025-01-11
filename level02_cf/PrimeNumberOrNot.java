//imported all classes so that we can use their inbuilt functions
import java.util.*;
public class PrimeNumberOrNot{

    public static void main(String [] args){
	
	//Created new Scanner
    Scanner input = new Scanner(System.in);
	
	//taking user inputs
	int number = input.nextInt();
	
	//Initializing a variable isPrime with true value
	boolean isPrime = true;
	
	//if the number is less than or equal to one then it is not a prime number
	if(number <= 1){
		isPrime = false;
	}
	
	// here numbers from 2 to the user input number, If the reminder is zero than break out from the loop
	else{
	for(int i = 2; i < number; i++){
	   if(number % i == 0){
	   isPrime = false;
	   break;
	   }
	}
}
	    
	if(isPrime){
	System.out.println(number + " is prime number");	
	   }
	   
	   else{
	   System.out.println(number + " is not prime");
	}
	
	//Scanner closed
	input.close();
	}
}

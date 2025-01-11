//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create NaturalNumber class for calculate quotient and remainder
public class NaturalNumber{

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create a variable number and take input from user
	int number  = s.nextInt();
	
	//use if else condition statement
	//if number is greater than zero than print sum of natural number
	if(number > 0) {
	
	int sum = number * (number + 1) / 2;
	System.out.println("The sum of " + number + " natural numbers is " + sum);
	}
	
	//here number is less than zero or equal to zero than print it is not a natural number
	else{
	
	System.out.println("The number " + number + "  is not a natural number");
	}
  }
}
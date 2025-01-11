import java.util.Scanner;
class FizzBuzzUsingWhileLoop{
    public static void main(String[] args) {
		
		//Scanner created
        Scanner input = new Scanner(System.in);

        // Taking user input to generate the FizzBuzz Pattern
        System.out.print("Enter a number to generate FizzBuzz - ");
        int number = input.nextInt();
		
		//Checking if the user input is less than 0
		if(number<0){
			return;
		}
		
        // Generating FizzBuzz pattern
		int sequence=0;
        while(sequence<=number){
			//Check for the condition if number is divisible by 3 and 5
			if(sequence%3==0 && sequence%5==0){
				System.out.println("FizzBuzz");
			}
			//Check for the condition if number is divisible by 3 
			else if(sequence%3==0){
				System.out.println("Fizz");
			}
			//Check for the condition if number is divisible by 5
			else if(sequence%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(sequence);
			}
			sequence++;
		}

		//Scanner closed
        input.close();
    }
}
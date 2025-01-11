import java.util.Scanner;
class FizzBuzzUsingForLoop{
    public static void main(String[] args) {
		
		//Scanner created
        Scanner input = new Scanner(System.in);

        // Taking user input to generate FizzBuzz pattern
        System.out.print("Enter a number to generate FizzBuzz - ");
        int number = input.nextInt();
		
		//Check if number is less than 0
		if(number<0){
			return;
		}
		
        // Generating FizzBuzz pattern
        for(int sequence=0;sequence<=number;sequence++){
			//Checking if number is divisible by 3 and 5
			if(sequence%3==0 && sequence%5==0){
				System.out.println("FizzBuzz");
			}
			//Checking if number is divisible by 3 
			else if(sequence%3==0){
				System.out.println("Fizz");
			}
			//Checking if number is divisible by 5
			else if(sequence%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(sequence);
			}
		}	
		//Scanner closed
        input.close();
    }
}
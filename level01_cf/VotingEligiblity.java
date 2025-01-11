import java.util.Scanner;

class VotingEligiblity{
    public static void main(String[] args) {
		
		//new scanner created
        Scanner sc = new Scanner(System.in);

        // Taking age as input
        System.out.print("Enter the person's age: ");
		
		// Store the input in the age variable
        int age = input.nextInt();

        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote");
        }
		
		//input close
        input.close();
    }
}

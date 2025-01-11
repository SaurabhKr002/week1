import java.util.Scanner;
class BMIcomputation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Taking as input user weight in kgs and height in cm
		System.out.print("Enter the your weight - ");
		double weightInKgs =  input.nextDouble();
		
		System.out.print("Enter the your height - ");
		double heightInCm =  input.nextDouble();
		
		// Converting height into meter 
		double heightConvertToMeter = heightInCm / 100;
		
		// Calculating BMI of user
		double bmi = weightInKgs / (heightConvertToMeter * heightConvertToMeter);
		
		// Checking condition of Underweight
		if (18.4 >= bmi ){
			System.out.print("Underweight");
		}
		
		// Checking condition of Normal
		else if(18.5 <= bmi && bmi <= 24.9){
			System.out.print("Normal");
		}
		
		// Checking condition of Overweight
		else if(25.0 <= bmi && bmi <= 39.9){
			System.out.print("Overweight");
		}
		
		// Checking condition of Obese
		else {
			System.out.print("Obese");
		}
		
		//Scanner closed
		input.close();
	}
}
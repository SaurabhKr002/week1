import java.util.Scanner;

public class GradeAndPercentageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking as input Marks o Pysis Chemistry and Maths
        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = input.nextInt();
	
		//Calculating the total marks
        int TotalMarks = physics + chemistry + maths;
		//Calculating percentage
        double percentage = (TotalMarks / 3.0);
		
		//Initializing variables for grade and remarks
        char grade;
        String remarks;
		
		// computing grades and remarks
        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }
		
		//Output Displayed
        System.out.println("\n--- Result ---");
        System.out.println("Average Marks: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
		
		//Scanner closed
        input.close();
    }
}

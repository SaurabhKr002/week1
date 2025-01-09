//Creating a class for calculating Percent Marks of Sam
class PercentMark{
public static void main (String[] args){
// Creating int type variables for Scores acquired by Sam in Maths, Physics and Chemistry respectively
int marksInMaths = 94, marksInPhysics =95, marksInChemistry =96; 
// Creating another int type variable for calculation of average Percent Marks
int avgPercentMarks = (marksInMaths + marksInPhysics + marksInChemistry) / 3; 
// Displaying the average percent marks of Sam 
System.out.println("The average Percent Marks of Sam is : " + avgPercentMarks);
}
}
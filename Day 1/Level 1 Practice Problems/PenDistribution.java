public class PenDistribution {
	public static void main(String[] args){
		
		// created two integer variables noOfStudents and noOfPens
		int noOfStudents = 3, noOfPens = 14;
	
		// equal distribution of pens
		int pensPerStudent = noOfPens / noOfStudents;
		// number of remaining pens
		int remainingPens = noOfPens % noOfStudents;
		
		// displaying the output 
		System.out.println("The Pen Per Student is " + pensPerStudent +" and the remaining pen not distributed is " + remainingPens);
	}
}
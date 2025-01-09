// Defining public class FindAverageMarks, which contains main() method

public class FindAverageMarks {
	
	// difining the main() method
	public static void main(String[] args){
		
		// created three integer variables mathsMarks, physicsMarks, and chemistryMarks
		// mathsMarks represents marks in maths, physicsMarks represents marks in physics, and chemistryMarks represents marks in chemistry
		// all marks are gained out of 100 by Sam
		
		int mathsMarks = 94, physicsMarks = 95, chemistryMarks = 96;
	
		// calculating the average marks of Sam and storing the result into a double variable averagePercentMarks
	
		double averagePercentMarks = (mathsMarks + physicsMarks + chemistryMarks)/3;
	
		// displaying the output 
	
		System.out.println("Sam’s average mark in PCM is " + averagePercentMarks);
	
	}
	
}
// importing scanner class for taking inputs from user
import java.util.Scanner;

public class CoutingHandshakes {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, numberOfStudents, and taking input for that
		int numberOfStudents = input.nextInt();
		
		// calculating maximum possible handshakes
		float totalHandshakes = ((float)numberOfStudents * ((float)numberOfStudents - 1)) / 2;
		
		// displaying the output 
		System.out.println("Total number of maximum possible handshakes is " + totalHandshakes);
	}
}
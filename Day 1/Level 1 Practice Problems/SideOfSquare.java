// importing scanner class for taking inputs from user
import java.util.Scanner;

public class SideOfSquare {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, perimeter and taking input for that
		int perimeter = input.nextInt();
	
		// calculating the value of a single side
		int singleSide = perimeter / 4;
		
		// displaying the output 
		System.out.println("The length of the side is " + singleSide + " whose perimeter is " + perimeter);
	}
}
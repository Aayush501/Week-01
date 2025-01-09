// importing scanner class for taking inputs from user
import java.util.Scanner;

public class DistanceScaleConversion {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a double variable, distanceInFeet and taking input for that
		float distanceInFeet = input.nextFloat();
		
		// conversion of the unit into yards and miles
		float distanceInYards = distanceInFeet / 3f;
		float distanceInMiles = distanceInYards / 1760f;
		
		// displaying the output 
		System.out.println("Distance in feet is " + distanceInFeet + " while in yards is " + distanceInYards + " and miles is " + distanceInMiles);
	}
}
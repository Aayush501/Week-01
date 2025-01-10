// importing scanner class for taking inputs from user
import java.util.Scanner;

public class HeightScaleConversion {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a double variable, heightInCentimeters and taking input for that
		float heightInCentimeters = input.nextFloat();
		
		// conversion of the unit into foot and inches
		float heightInFoot = heightInCentimeters / 12.0f;
		float heightInInches = heightInCentimeters / 2.54f;
		
		// displaying the output 
		System.out.println("Your Height in cm is " + heightInCentimeters + " while in feet is " + heightInFoot + " and inches is " + heightInInches);
	}
}
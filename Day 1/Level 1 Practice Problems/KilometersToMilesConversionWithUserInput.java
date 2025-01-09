// importing scanner class for taking inputs from user
import java.util.Scanner;

public class KilometersToMilesConversionWithUserInput {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a double variable kilometer and taken the value of kilometer from the user
		double kilometer = input.nextDouble();
		
		// conversion of kilometer value into miles
		double miles = kilometer * 0.621;
		
		// displaying the output 
		System.out.println("The total miles is " + miles + " mile for the given " + kilometer + " km");
	}
}
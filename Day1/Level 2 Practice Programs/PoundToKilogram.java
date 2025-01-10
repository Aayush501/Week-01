import java.util.Scanner;

public class PoundToKilogram {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a float variable, pound, and taking input for that
		float pound = input.nextFloat();
		
		// conversion from pound to kilogram
		float kilogram = 2.2f * pound;
		
		// displaying the output 
		System.out.println("The weight of the person in pound is " + pound + " and in kg is " + kilogram);
	}
}
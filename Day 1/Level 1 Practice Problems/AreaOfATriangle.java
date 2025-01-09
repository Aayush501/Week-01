// importing scanner class for taking inputs from user
import java.util.Scanner;

public class AreaOfATriangle {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created two integer variables, base, and height, and taking inputs for them
		int base = input.nextInt();
		int height = input.nextInt();
	
		// calculating area of a triangle
		float areaOfTriangle = 0.5f * (float)base * (float)height; //since area of triangle = (1/2)*base*height;
		
		// displaying the output 
		System.out.println("Area of given triangle is " + areaOfTriangle);
	}
}
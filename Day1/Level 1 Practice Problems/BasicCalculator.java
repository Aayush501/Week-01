// importing scanner class for taking inputs from user
import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created two integer variables, number1, and number2, and taking inputs for them
		int number1 = input.nextInt();
		int number2 = input.nextInt();
	
		// all arithmatic calculations
		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		
		// displaying the output 
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers number1 and number2 is " + addition + ", "  + subtraction + ", " + multiplication + " and " + division);
	}
}
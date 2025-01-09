import java.util.Scanner;

public class NumberSwapping {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a double and an integer variables, number1, and number2, and taking input for them
		int number1 = input.nextInt();
		int number2 = input.nextInt(); 
		
		// swapping the numbers 
		number1 = number1 ^ number2;
		number2 = number1 ^ number2;
		number1 = number1 ^ number2;
		
		
		// displaying the output 
		System.out.println("The swapped numbers are " + number1 + " and " + number2);
	}
}
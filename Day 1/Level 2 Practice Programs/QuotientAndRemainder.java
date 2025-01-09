import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a double and an integer variables, unitPrice, and quantity, and taking input for them
		int number1 = input.nextInt();
		int number2 = input.nextInt(); 
		
		// calculation 
		int quotientValue = number1 / number2;
		int remainderValue = number1 % number2;
		
		// displaying the output 
		System.out.println("The Quotient is " + quotientValue + " and Reminder is " + remainderValue + " of two numbers " + number1 + " and " + number2);
	}
}
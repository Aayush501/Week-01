import java.util.Scanner; // importing scanner class

public class Factorial{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, number, and taking input for that 
		int number = input.nextInt();
		
		// created an integer variable, fact to store the answer
		int fact = 1;
		
		// calculating the factorial using while loop
		while(number >= 1){
			fact = fact * number;
			number --;
		}
		
		System.out.println("The factorial of given number is " + fact);
		
		input.close(); // closing the Scanner object
	}
}
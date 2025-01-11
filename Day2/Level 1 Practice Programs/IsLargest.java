import java.util.Scanner; // importing scanner class

public class IsLargest {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created three integer variables, number1, number2, and number3, and taking input for them 
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// checking if the first entered number is largest
		if(Math.max(Math.max(number1, number2), number3) == number1){ // Math.max() function returns the maximum integer between different arguments
			System.out.println("Is the first number the largest? " + "Yes"); // printing the output
		}
		else{
			System.out.println("Is the first number the largest? " + "No"); // printing the output
		}
		
		// checking if the second entered number is largest
		if(Math.max(Math.max(number1, number2), number3) == number2){ // Math.max() function returns the maximum integer between different arguments
			System.out.println("Is the second number the largest? " + "Yes"); // printing the output
		}
		else{
			System.out.println("Is the second number the largest? " + "No"); // printing the output
		}
		
		// checking if the third entered number is largest
		if(Math.max(Math.max(number1, number2), number3) == number3){ // Math.max() function returns the maximum integer between different arguments
			System.out.println("Is the third number the largest? " + "Yes"); // printing the output
		}
		else{
			System.out.println("Is the third number the largest? " + "No"); // printing the output
		}
		
		input.close(); // closing the Scanner object
	}
}
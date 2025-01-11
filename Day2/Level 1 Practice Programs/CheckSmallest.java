import java.util.Scanner; // importing scanner class

public class CheckSmallest {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created three integer variables, number1, number2, and number3, and taking input for them 
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// checking if the first entered number is smallest
		if(Math.min(Math.min(number1, number2), number3) == number1){ // Math.min() function returns the minimum integer between different arguments
			System.out.println("Is the first number the smallest? " + "Yes"); // printing the output
		}
		else{
			System.out.println("Is the first number the smallest? " + "No"); // printing the output
		}
		input.close(); // closing the Scanner object
	}
}
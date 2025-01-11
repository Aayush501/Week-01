import java.util.Scanner;

public class NumberReverse {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that 
		int number = input.nextInt();
		
		// created two integer variables, noOfDigits, and numberReplica
		int noOfDigits = 0, numberReplica = number;
		
		// iterating using while loop through the numberReplica
		while (numberReplica > 0) {
			noOfDigits++;
			numberReplica /= 10;
		}
		
		// created an integer array to store the digits of the number
		int [] digits = new int [noOfDigits];
		
		// iterating using while loop through the number
		int iterator = 0;
		while (number > 0) {
			digits [iterator] = number % 10;
			number /= 10;
			iterator++;
		}
		
		// printing the digits in reverse order
		for (iterator = 0; iterator < noOfDigits; iterator++) {
			System.out.print(digits [iterator]);
		}
	}
}
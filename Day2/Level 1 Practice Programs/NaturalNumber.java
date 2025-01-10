import java.util.Scanner;

public class NaturalNumber {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		// created an integer variable, number, and taking input for that
		int number = input.nextInt();
		
		// created an integer variable, sum to store the sum of the numbers
		int sum = 0;
		
		if(number >= 1){
			sum = number * (number + 1) / 2; // since the sum of n natural numbers is n * (n+1) / 2 
			System.out.println("The sum of " + number + " natural numbers is " + sum);
		}
		else{
			System.out.println("The number " + number + " is not a natural number");
		}
	}
}
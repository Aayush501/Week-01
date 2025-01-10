// importing scanner class for taking inputs from user
import java.util.Scanner;

public class UniversityFeeWithUserInput {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created two integer variables, initialFee, and discountPercent, and taking inputs for them
		int initialFee = input.nextInt();
		int discountPercent = input.nextInt();
	
		// calculating discount amount and discounted fee
		double discountAmount = ((float)initialFee * (float)discountPercent) / 100;
		double discountedFee = initialFee - discountAmount;
		
		// displaying the output 
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
	}
}
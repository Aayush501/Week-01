// importing scanner class for taking inputs from user
import java.util.Scanner;

public class PreparingBill {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a double and an integer variables, unitPrice, and quantity, and taking input for them
		float unitPrice = input.nextFloat();
		int quantity = input.nextInt(); 
		
		// calculation 
		float totalPurchase = unitPrice * (float)quantity;
		
		// displaying the output 
		System.out.println("The total purchase price is INR " + totalPurchase + " if the " + quantity + " and unit price is INR " + unitPrice);
	}
}
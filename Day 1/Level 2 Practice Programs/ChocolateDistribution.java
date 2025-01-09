import java.util.Scanner;

public class ChocolateDistribution {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created two integer variables numberOfchocolates and numberOfChildren, and taking inputs for them
		int numberOfchocolates = input.nextInt(), numberOfChildren = input.nextInt();
	
		// equal distribution of chocolates
		int chocolatesPerStudent = numberOfchocolates / numberOfChildren;
		// number of remaining chocolates
		int remainingChocolates = numberOfchocolates % numberOfChildren;
		
		// displaying the output 
		System.out.println("The number of chocolates each child gets is " + chocolatesPerStudent + " and the number of remaining chocolates are " + remainingChocolates);
	}
}
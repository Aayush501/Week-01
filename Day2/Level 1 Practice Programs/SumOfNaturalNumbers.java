import java.util.Scanner; // importing scanner class

public class SumOfNaturalNumbers {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, number, and taking input for that 
		int number = input.nextInt();
		
		// created two integer variables, formulaSum, and loopSum
		int formulaSum = 0;
		int loopSum = 0;
		// the sum of n natural numbers is n * (n+1) / 2 
		
		if(number >= 1){
			formulaSum = number * (number + 1) / 2; // sum calculated using formula
			
			while(number >= 1){  // sum calculated using while loop
				loopSum += number;
				number --;
			}
			
			System.out.println("Sum calculated using while loop is " + loopSum + " and by using formula is " + formulaSum + ". Both are same.");
		}
		else{
			System.out.println("The number " + number + " is not a natural number");
		}
		
		input.close(); // closing the Scanner object
	}
}
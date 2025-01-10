import java.util.Scanner; // importing scanner class

public class SumOfNaturalNumbers2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, number, and taking input for that 
		int number = input.nextInt();
		
		// created two integer variables, formulaSum, and loopSum
		int formulaSum = 0;
		int loopSum = 0;
		
		// A sum of n natural numbers is n * (n+1) / 2 
		if(number >= 1){
			formulaSum = number * (number + 1) / 2; // sum calculated using formula
			
			for(int i=number; i>= 1; i--){ // sum calculated using while loop
				loopSum += i;
			}
			
			System.out.println("Sum calculated using for loop is " + loopSum + " and by using formula is " + formulaSum + ". Both are same.");
		}
		else{
			System.out.println("The number " + number + " is not a natural number");
		}
		
		input.close(); // closing the Scanner object
	}
}
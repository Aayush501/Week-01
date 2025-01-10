import java.util.Scanner; // importing scanner class

public class SumUntilZero2 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created a double variable, sum, and taking input for that 
		double sum = 0.0;
		
		// iterating until user enters 0 or any negative number
		while(true){
			double userInput = input.nextDouble();
			
			if(userInput <= 0){
				break;
			}
			
			sum += userInput;
		}
		
		System.out.println("Sum of all the numbers entered by user is " + sum);
		
		input.close(); // closing the Scanner object
	}
}
import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created three float variables, principal, rate, and time, and taking inputs for them
		float principal = input.nextInt(); 
		float rate = input.nextInt();
		float time = input.nextInt();
		
		// Calculating the result
		float simpleInterest = (principal * rate * time) / 100;
		
		// Displaying the output
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	}
}
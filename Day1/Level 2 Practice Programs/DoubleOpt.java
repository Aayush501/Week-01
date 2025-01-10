import java.util.Scanner;

public class DoubleOpt  {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created three double variables, a, b, and c, and taking input for them
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// performing all arithmetic operations
		double firstOperation = a + b *c;
		double secondOperation = a * b + c;
		double thirdOperation = c + a / b;
		double fourthOperation = a % b + c;
		
		// displaying the output 
		System.out.println("The results of all arithmetic operations are " + firstOperation + ", " + secondOperation + ", " + thirdOperation + ", and " + fourthOperation);
	}
}
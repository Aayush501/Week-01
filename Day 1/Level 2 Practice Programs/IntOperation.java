import java.util.Scanner;

public class IntOperation {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created three integer variables, a, b, and c, and taking input for them
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		// performing all arithmetic operations
		int firstOperation = a + b *c;
		int secondOperation = a * b + c;
		int thirdOperation = c + a / b;
		int fourthOperation = a % b + c;
		
		// displaying the output 
		System.out.println("The results of all arithmetic operations are " + firstOperation + ", " + secondOperation + ", " + thirdOperation + ", and " + fourthOperation);
	}
}
import java.util.Scanner; // importing scanner class

public class NatureOfNumber {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, number, and taking input for that 
		int number = input.nextInt();

		// identifying the nature of the number
		if(number < 0){
			System.out.println("Negative");
		}
		else if(number >0){
			System.out.println("Positive");
		}
		else{
			System.out.println("Zero");
		}
	}
}
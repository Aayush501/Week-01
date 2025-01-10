import  java.util.Scanner; // importing scanner class

public class RocketLaunchCountDownWithForLoop {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, counter, and taking input for that
		int counter = input.nextInt();
		
		
		// looping for displaying output
		for(int i = counter; i>=1; i--){
			System.out.print(counter + " ");
			counter--;
		}
		
		input.close(); // closing the Scanner object
	}
}
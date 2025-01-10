import  java.util.Scanner; // importing scanner class

public class RocketLaunchCountDownWithWhileLoop {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, counter, and taking input for that
		int counter = input.nextInt();
		
		// printing the count down
		while(counter >= 1){
			System.out.print(counter + " ");
			counter--;
		}
		
		input.close(); // closing the Scanner object
	}
}
import java.util.Scanner; // importing scanner class

public class EvenAndOdd {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, number, and taking input for that 
		int number = input.nextInt();
		
		// created an integer variable, i for interating through while loop
		int i = 1;
		
		// iterating through while loop
		while(i <= number){
			if(i % 2 == 0){
				System.out.println("Number " + i + " is even");
			}
			else{
				System.out.println("Number " + i + " is odd");
			}
			i++;
		}
		
		input.close(); // closing the Scanner object
	}
}
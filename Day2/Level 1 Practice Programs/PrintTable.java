import java.util.Scanner; // importing scanner class

public class PrintTable{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, number, and taking input for that 
		int number = input.nextInt();
		
		// printing the output
		for(int i=1; i<=10; i++){
			System.out.println(number + " x " + i + " = " + i*number);
		}
		
		input.close(); // closing the Scanner object
	}
}
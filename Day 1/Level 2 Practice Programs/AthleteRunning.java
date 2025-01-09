import java.util.Scanner;

public class AthleteRunning {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created three integer variables, side1, side2, and side3, and taking input for them
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		
		// calculation 
		int perimeter = side1 + side2 + side3;
		double noOfRounds = (double)5000 / (double)perimeter;
		
		// displaying the output 
		System.out.println("The total number of rounds the athlete will run is " + noOfRounds + " to complete 5 km");
	}
}
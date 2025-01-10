import java.util.Scanner; // importing scanner class

public class BonusCalculation {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created _ integer variables, salary, and yearOfService, and taking input for them
		int salary = input.nextInt();
		int yearOfService = input.nextInt();
		
		// created an integer variable, bonus, for calculating bonus 
		int bonus = 0;
		
		if(yearOfService > 5){
			bonus = salary / 20;
		}
		
		System.out.println("Bonus amount for the employee is " + bonus);
		
		input.close(); // closing the Scanner object
	}
}
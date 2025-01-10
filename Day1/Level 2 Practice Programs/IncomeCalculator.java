import java.util.Scanner;

public class IncomeCalculator {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created two integer variable, salary, and bonus, and taking input for them
		int salary = input.nextInt();
		int bonus = input.nextInt();
		
		// calculation of total income
		int totalIncome = salary + bonus;
		
		// displaying the output 
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
	}
}
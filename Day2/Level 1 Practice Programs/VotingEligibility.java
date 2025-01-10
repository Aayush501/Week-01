import java.util.Scanner; // importing scanner class

public class VotingEligibility {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, age, and taking input for that 
		int age = input.nextInt();

		// checking the eligibility of the person to vote
		if(age >= 18){
			System.out.println("The person's age is " + age + " and can vote.");
		}
		else{
			System.out.println("The person's age is " + age + " and cannot vote.");
		}
	}
}
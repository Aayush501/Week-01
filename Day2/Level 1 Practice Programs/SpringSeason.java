import java.util.Scanner; // importing scanner class

public class SpringSeason {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created two integer variables, month, and day, and taking input for them
		int month = input.nextInt();
		int day = input.nextInt();
		
		// checking if it is a spring season or not
		// Spring Season is from March 20 to June 20
		if(month >= 3 && month <=6){
			if((month == 3 && day < 20) || (month == 6 && day > 20)){
				System.out.println("Not a Spring Season");
			}
			else{
				System.out.println("Its a Spring Season");
			}
		}
		else{
			System.out.println("Not a Spring Season");
		}
		input.close(); // closing the Scanner object
	}
}
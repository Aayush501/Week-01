import java.util.Scanner; // importing scanner class

public class IsDivisibleByFive{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		int number = input.nextInt();
		
		// checking the divisibility
		if(number %5 == 0){ // number is divisible by 5
			System.out.println("Is the number " + number + " divisible by 5? " + "yes");
		}
		else { // number is not divisible by 5
			System.out.println("Is the number " + number + " divisible by 5? " + "no");
		}
		
		input.close();
	}
}
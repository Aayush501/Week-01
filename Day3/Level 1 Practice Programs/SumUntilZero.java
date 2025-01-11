import java.util.Scanner;

public class SumUntilZero {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // object of scanner class
		
		// created a double variable and a double array
		double sum = 0.0;
		double[]numbers = new double[10];
		
		// created an integer variable for iteration
		int i=0;
		while(true){
			if(i >= 10) break;
			
			double userInput = sc.nextDouble();
			
			if(userInput <= 0){
				break;
			}
			
			numbers[i] = userInput;
			sum += userInput;
			i++;
		}
		
		System.out.println("The input numbers are : ");
		
		for(int j=0; j<i; j++){
			System.out.print(numbers[j] + " ");
		}
		System.out.println();
		System.out.println("The sum of the above numbers are " + sum);
		
		sc.close(); // closing the scanner object
	}
}
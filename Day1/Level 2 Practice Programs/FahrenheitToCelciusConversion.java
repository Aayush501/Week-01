import java.util.Scanner;

public class FahrenheitToCelciusConversion {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a float variable, fahrenheit, and taking input for that
		float fahrenheit = input.nextFloat();
		
		// conversion from fahrenheit to celcius
		float celcius = (fahrenheit - 32) * (float)5 / (float)9;
		
		// displaying the output 
		System.out.println("The " + fahrenheit + " fahrenheit is " + celcius + " celcius");
	}
}
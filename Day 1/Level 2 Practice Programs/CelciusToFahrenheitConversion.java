import java.util.Scanner;

public class CelciusToFahrenheitConversion {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a float variable, celcius, and taking input for that
		float celcius = input.nextFloat();
		
		// conversion from celcius to fahrenheit
		float fahrenheit = (celcius * (float)9 / (float)5) + 32;
		
		// displaying the output 
		System.out.println("The " + celcius + " celsius is " + fahrenheit + " fahrenheit");
	}
}
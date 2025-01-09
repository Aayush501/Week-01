// Defining public class KilometersToMilesConversion, which contains main() method

public class KilometersToMilesConversion {
	
	// defining the main() method
	public static void main(String[] args){
		
		// created an double variable distanceInKilometers and assigned it the value 10.8 
	
		double distanceInKilometers = 10.8;
	
		// converting kilometers into miles and storing the result into a double variable distanceInMiles
		//  1 km = 0.6 miles
	
		double distanceInMiles = 10.8 * 0.6;
	
		// displaying the output 
	
		System.out.println("The distance " + distanceInKilometers + "km in miles is " + distanceInMiles + " miles");
	
	}
	
}
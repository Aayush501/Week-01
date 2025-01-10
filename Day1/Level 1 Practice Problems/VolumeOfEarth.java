public class VolumeOfEarth {
	public static void main(String[] args){
		
		// created an integer variable radiusOfEarth
		int radiusOfEarth = 6378;
	
		// calculating the volume of earth
		double pi = 3.14; //value of pi
		double earthVolumeInKilometers = (4.0 / 3.0) * pi * radiusOfEarth * radiusOfEarth * radiusOfEarth; //  Volume of a Sphere = (4/3) * pi * r^3
		double earthVolumeInMiles = earthVolumeInKilometers * 1.60; // since 1 mile = 1.60 kilometers
		
		// displaying the output 
		System.out.println("The volume of earth in cubic kilometers is " + earthVolumeInKilometers + " and cubic miles is " + earthVolumeInMiles);
	}
}

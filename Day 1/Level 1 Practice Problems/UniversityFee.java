public class UniversityFee {
	public static void main(String[] args){
		
		// created two integer variables, initialFee, and discountPercent
		int initialFee = 125000, discountPercent = 10;
	
		// calculating discount amount and discounted fee
		double discountAmount = ((float)initialFee * (float)discountPercent) / 100;
		double discountedFee = initialFee - discountAmount;
		
		// displaying the output 
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
	}
}
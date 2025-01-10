public class CalculateProfitAndLoss {
	public static void main(String[] args){
		
		// created two integer variables costPrice, and sellingPrice
		int costPrice = 129, sellingPrice = 191;
	
		// calculating the profit and storing the result in an integer variable profit
		int profit = sellingPrice - costPrice;
		
		// calculating the profit percentage and storing the result in a double variable profitPercentage
		double profitPercentage = ((double)profit/(double)costPrice) * 100;
		
		// displaying the output 
		System.out.println("The Cost Price is INR "+ costPrice +" and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	
	}
	
}
public class FindProfitLoss{
	public static void main(String[] args){
		int costPrice = 129;
		int sellPrice = 191;
	    float profit = sellPrice - costPrice;
		float profitPercentage = (profit / costPrice)*100;
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellPrice  + "\nThe Profit is INR " +profit + " and the Profit Percentage is " +profitPercentage);
	}
}
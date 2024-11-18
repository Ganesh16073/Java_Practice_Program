import java.util.*;
public class StockProfit {

    
    public static int maxProfit(int[] prices)  // Method to calculate the maximum profit
	{
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) 
		{
            if (prices[i] > prices[i - 1])  // If current price is greater than previous, add the difference to maxProfit
			{
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
	
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size;
        int[] prices;
		System.out.println("enter the Size Of array");
		size=sc.nextInt();
		price=new int[size];
		System.out.println("enter the Array Element");
		for(int i=0;i<price.length;i++)
		{
			price[i]=sc.nextInt();
		}
        System.out.println("Maximum Profit for prices1: " + maxProfit(prices1));
    }
}

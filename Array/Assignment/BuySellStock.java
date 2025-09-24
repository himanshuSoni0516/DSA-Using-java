package Array.Assignment;

public class BuySellStock {

    public static int maxProfit(int[] prices) {
        // Edge case: if prices array is empty
        if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE; // Store the minimum price so far
        int maxProfit = 0;                // Store the maximum profit so far

        // Traverse through each day's price
        for (int price : prices) {
            // Update minPrice if we find a lower price
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if we sell today
            int profit = price - minPrice;

            // Update maxProfit if today's profit is better
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}

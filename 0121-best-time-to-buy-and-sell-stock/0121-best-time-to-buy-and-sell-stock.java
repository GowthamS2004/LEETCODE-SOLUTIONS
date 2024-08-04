class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initially, set minPrice very high.
        int maxProfit = 0; // Initially, no profit has been made.

        for (int price : prices) {
            if (price < minPrice) {
                // Update the minimum price to the current price if it's lower than what we have seen.
                minPrice = price;
            } else {
                // Calculate potential profit if we sold at the current price.
                int profit = price - minPrice;
                // Update maxProfit if the current profit is higher than what we have seen.
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit; // Return the highest profit we found.
    }
}

public class BuyAndSellStock {
    public static int maxProfit(int[] arr) {
        // the best time to buy stocks will be when the buying prices is the lowest
        int buy = arr[0];
        int profit = 0; 
        for (int i = 1; i < arr.length; i++){
            if (buy < arr[i]){
                profit = Math.max(profit,arr[i] - buy);
            } else {
                buy = arr[i];
            }
        }

        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}

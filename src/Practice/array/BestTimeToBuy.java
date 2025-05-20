package Practice.array;

public class BestTimeToBuy {
    public static void main(String[] args) {
        int[] prices = {1,2,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice= Integer.MAX_VALUE;

        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

}

import java.util.*;

public class Profit_stokes {

    public static int Cal_Profit(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;


        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int[] prices = {2,4,1};
        System.out.println(Cal_Profit(prices));
    }
}
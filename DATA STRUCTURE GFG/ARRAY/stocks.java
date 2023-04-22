// package ARRAY;

public class stocks {
    
    public static int maxProfit(int arr[], int start, int end)
    {
        if(start>=end)
        return 0;
        int profit = 0;
        for(int i = start; i<end; i++){
            for(int j= i+1; j<=end; j++)
            {
                if(price[j]>price[i]){
                    int curr_profit = price[j] -price[i] + maxProfit(price, start, i-1)+ maxProfit(arr, j+1, end);
                    profit = maxProfit(profit, curr_profit);
                }
            }
        
        }
        return profit;
        
    }
}

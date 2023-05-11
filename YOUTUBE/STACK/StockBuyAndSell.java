public class StockBuyAndSell {
    


    public static int buyAndSell(int prices[]){
        int buyPrices = Integer.MAX_VALUE;

        int maxprofit = 0;

        for(int i = 0 ; i<prices.length; i++){
            if(buyPrices<prices[i]){
                int profit = Math.max(maxprofit, buyPrices);
            }
            buyPrices = prices[i];
        }
        return maxprofit;



    }

    public static void main(String[] args) {
        int prices[] = {1,5,2,6,8,3};
       
        
        System.out.println(buyAndSell(prices));
    }
}

public class Example2BuySellStock {

    public static void main(String[] args) {
        //int[] prices = {7, 1, 5, 3, 6, 4}; //result 5
        int[] prices = {7, 6, 4, 3, 1}; //result 0
        int buy = prices[0];
        int maxProfit=0;

        for(int i=1; i< prices.length; i++){
            if(prices[i]< buy){
                buy= prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - buy);
            }
        }
        System.out.println(maxProfit);
    }
}

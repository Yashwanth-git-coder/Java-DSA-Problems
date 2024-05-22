public class buy_sell {
    public static int Buy_Sell_Stock(int number[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0 ; i < number.length ; i++){
            if(buyprice < number[i]){
                int profit = number[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = number[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){

        int numbers[] = {2, 3, 5, 1, 6, 7, 3, 4};

        System.out.println(Buy_Sell_Stock(numbers)); 
    }
}

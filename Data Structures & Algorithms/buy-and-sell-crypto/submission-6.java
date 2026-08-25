class Solution {
    public int maxProfit(int[] prices) {

        int minvalue=Integer.MAX_VALUE;

        int profit=0;

        for(int price:prices){

            if(price<minvalue){
                minvalue=price;
            }

            minvalue=Math.min(minvalue,price);
            profit=Math.max(profit,price-minvalue);
        }
        return profit;
    }
}

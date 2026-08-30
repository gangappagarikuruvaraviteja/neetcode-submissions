class Solution {
    public int maxProfit(int[] prices) { 

        int maxprofit=0;
        int minvalue=Integer.MAX_VALUE;

        for(int price:prices){

            if(price<minvalue){
                minvalue=price;
                
            }
        minvalue=Math.min(minvalue,price);
        maxprofit=Math.max(maxprofit,price-minvalue);

        }

        return maxprofit;
        
    }
}

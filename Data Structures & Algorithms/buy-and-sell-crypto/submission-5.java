class Solution {
    public int maxProfit(int[] prices) {

     
    //  int max=0;

    //  for(int i=0;i<prices.length;i++){

    //     for(int j=i+1;j<prices.length;j++){
    //         int profit=prices[j]-prices[i];

    //         max=Math.max(profit,max);
    //     }
    //  }
    //  return max;


        int minvalue=Integer.MAX_VALUE;
        // int max=0;
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

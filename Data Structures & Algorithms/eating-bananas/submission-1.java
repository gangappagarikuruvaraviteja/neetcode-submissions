class Solution {
    public boolean ispossible(int []piles,int h,int k){
        
            for(int pile:piles){
                int temp=pile/k;
                if(pile%k!=0){
                    temp++;
                }
                h=h-temp;
                if(h<0){
                    return false;
                }
            }

        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {

        int left=1;
        int right=(int)Math.pow(10,9);

        while(left<=right){
            int mid=left+(right-left)/2;

            if(ispossible(piles,h,mid)){
                right=mid-1;
            }
            else{
                 left=mid+1;
            }
        }
        return left;
        
    }
}

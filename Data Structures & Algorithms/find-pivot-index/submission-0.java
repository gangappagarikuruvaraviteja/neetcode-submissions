class Solution {
    public int pivotIndex(int[] nums) {

     int n=nums.length;
     int totalsum=0;
     int leftsum=0;
     for(int num:nums){
      totalsum+=num;

     }

     for(int i=0;i<n;i++){
       int rightsum=totalsum-leftsum-nums[i];

       if(rightsum==leftsum){
        return i;
       }
        leftsum+=nums[i];
     }
     return -1;
     
    }
}
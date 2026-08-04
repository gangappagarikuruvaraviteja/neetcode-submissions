class Solution {
    public int[] productExceptSelf(int[] nums) {


            int n=nums.length;
            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                int pro=1;
                for(int j=0;j<n;j++){
                    if(j!=i){

                        pro=pro*nums[j];
                    }
                }
                
                arr[i]=pro;
            }
            return arr;

    }
}  

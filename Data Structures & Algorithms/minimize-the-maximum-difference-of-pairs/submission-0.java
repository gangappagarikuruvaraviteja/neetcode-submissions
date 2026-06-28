class Solution {
        public boolean ispossible(int[]nums,int p,int diff){

                int count=0;

                for(int i=1;i<nums.length;i++){
                    if(nums[i]-nums[i-1]<=diff){
                        count++;
                        i++;
                    }
                    if(count>=p){
                        return true;
                    }

                   
                }
                 return false;
        }

    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n=nums.length;

     int left = 0;
int right = nums[n-1] - nums[0];

        while(left<=right){

            int mid=left+(right-left)/2;

            if(ispossible(nums,p,mid)){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;

    }
}
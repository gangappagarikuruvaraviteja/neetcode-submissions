class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n=nums.length;
        int []res=new int[n];

        int left=0;
        int right=n-1;

        int index=n-1;

        while(left<=right){
            int leftsqrt=nums[left]*nums[left];
            int rightsqrt=nums[right]*nums[right];

            if(leftsqrt>rightsqrt){
                res[index]=leftsqrt;
                left++;
            }
            else{
                res[index]=rightsqrt;
                right--;
            }
            index--;

        }

        return res;
    }
}
class Solution {
    public void rotate(int[] nums, int k) {


  int n=nums.length;

            k=k%n;

            rotates(nums,0,n-1);
            rotates(nums,0,k-1);
            rotates(nums,k,n-1);

    }
        public static void rotates(int []nums,int left,int right){

            //   int n=nums.length;


                while(left<right){

                    int temp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=temp;

                    left++;
                    right--;
                }





        

    }     
    
}
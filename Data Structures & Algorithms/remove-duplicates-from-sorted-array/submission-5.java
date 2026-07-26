class Solution {
    public int removeDuplicates(int[] nums) {

        // int ans=1;
        
        // for(int j=1;j<nums.length;j++){
        //     if(nums[j]!=nums[j-1]){
        //         nums[ans]=nums[j];
        //         ans++;
        //     }
        // }
        // return ans;

// class Solution {
//     public int removeDuplicates(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int ind = 0;

        for (int num : set) {
            nums[ind] = num;
            ind++;
        }

        return ind;
    }
}
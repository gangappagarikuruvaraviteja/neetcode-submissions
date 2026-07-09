class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     int n=nums.length;
    //     HashSet<Integer> set=new HashSet<>();

    //     for(int i=0;i<n;i++){

    //         if(i>k){
    //             set.remove(nums[i-k-1]);
    //         }

    //         if(set.contains(nums[i])){
    //             return true;
    //         }

    //         set.add(nums[i]);

    //     }

    //    return false;

    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
        }
    }
    return false;

    }
}
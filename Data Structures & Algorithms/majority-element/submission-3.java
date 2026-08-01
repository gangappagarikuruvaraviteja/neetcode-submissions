class Solution {
    public int majorityElement(int[] nums) {
    
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){

            map.put(num,map.getOrDefault(num,0)+1);

            if(map.get(num)>n/2){
                return num;

            }

        }
                return -1;


    //   Arrays.sort(nums);
    //         int count=1;
    //         int maxcount=1;
    //         int majority=nums[0];
    //       for(int i=1;i<nums.length;i++){
    //         if(nums[i]==nums[i-1]){
    //             count++;
    //         }
    //         else{
    //             count=1;
    //            }

    //            if(count>maxcount){
    //                 maxcount=count;
    //                 majority=nums[i];
    //            }
    //       }
    //         return majority;
    
    }
}
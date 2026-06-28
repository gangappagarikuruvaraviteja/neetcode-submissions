class Solution {
    public int singleNonDuplicate(int[] nums) {
        

//         int sum=0;

//         for(int num:nums){
//             sum=sum^num;
//         }
//         return sum;
//     }
// }
    int n=nums.length;
    int left=0;
    int right=n-1;

    while(left<right){
        int mid=left+(right-left)/2;

        if(mid%2==1){
            mid--;
        }
        if(nums[mid]==nums[mid+1]){
            left=mid+2;
        }
        else{
            right=mid;
        }
    }
    return nums[left];

    }}


class Solution {
    public int maxArea(int[] heights) {

        int left=0;
        int right=heights.length-1;
        int max=0;

        while(left<right){

            int area=right-left;
            int width=Math.min(heights[left],heights[right]);

            int maxarea=area*width;

            max=Math.max(max,maxarea);

            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
        }


        }
        return max;
        
    }
}

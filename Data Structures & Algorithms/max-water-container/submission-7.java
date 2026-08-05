class Solution {
    public int maxArea(int[] heights) {
        
        // int left=0;
        // int right=heights.length-1;

    int left=0;
    int right=heights.length-1;

    int max=0;

    while(left<right){

      int width=right-left;
      int h=Math.min(heights[left],heights[right]);

      int maxarea=width*h;

      max=Math.max(maxarea,max);


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

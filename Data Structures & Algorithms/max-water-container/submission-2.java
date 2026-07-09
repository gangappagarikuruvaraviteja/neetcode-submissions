class Solution {
    public int maxArea(int[] heights) {
        

            int max=0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){

                int area=(j-i);
                int width=Math.min(heights[i],heights[j]);
                int maxarea=area*width;
                max=Math.max(maxarea,max);
            }
        }
        return max;

    }
}

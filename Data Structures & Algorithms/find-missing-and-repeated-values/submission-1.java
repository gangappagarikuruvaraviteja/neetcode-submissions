class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=grid.length;

            for(int[]row:grid){
        for(int num:row){
            map.put(num,map.getOrDefault(num,0)+1);
        }
            }
        int rep=0;
        int rem=0;
        for(int i=1;i<=n*n;i++){

            int count=map.getOrDefault(i,0);
            if(count==2){
                 rep=i;
            }
            if(count==0){
                rem=i;
            }

        }

        return new int []{rep,rem};

        
    }
}
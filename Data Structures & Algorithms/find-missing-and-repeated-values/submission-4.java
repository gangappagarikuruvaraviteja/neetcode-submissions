class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n=grid.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int []row:grid){
            for(int num:row){
                map.put(num,map.getOrDefault(num,0)+1);
            }


        }

        int rem=0;
        int rep=0;


        for(int i=1;i<=n*n;i++){

            int count=map.getOrDefault(i,0);

            if(count==2){
                rep=i;
            }

            if(count==0){
                rem=i;
            }



        }
        return new int[]{rep,rem};
    }
}
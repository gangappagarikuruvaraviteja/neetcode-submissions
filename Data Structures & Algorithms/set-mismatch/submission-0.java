class Solution {
    public int[] findErrorNums(int[] nums) {

        int []arr=new int[2];

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int rep=0;
        int req=0;

        for(int i=0;i<=nums.length;i++){

            int count=map.getOrDefault(i,0);
            if(count==2){
                rep=i;
            }
            if(count==0){
                req=i;
            }


        }
           

        return new int[]{rep,req};
        
    }
}
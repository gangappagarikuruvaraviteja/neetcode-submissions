class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer,Integer>map=new HashMap<>();

            for(int ar:arr){
                map.put(ar,map.getOrDefault(ar,0)+1);
            }

            int ans=-1;
            for(int freq:map.keySet()){

                int key=map.get(freq);

                if(key==freq){

                    ans=Math.max(ans,key);
                }
            }
            return ans;
        
    }
}
class Solution {
    public int findLucky(int[] arr) {


     HashMap<Integer,Integer>map=new HashMap<>();
     for(int arrs:arr){
        map.put(arrs,map.getOrDefault(arrs,0)+1);
     }   

        int ans=-1;
        for(int key:map.keySet()){

            int freq=map.get(key);

            if(freq==key){
               
            ans=Math.max(ans,key);
            }
        }
        return ans;
    }
}
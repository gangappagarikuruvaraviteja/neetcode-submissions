class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character,Integer>map=new HashMap<>();

        for(char ch:text.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        
        int b=map.getOrDefault('b',0);
        int a=map.getOrDefault('a',0);
        int l=map.getOrDefault('l',0);
        int o=map.getOrDefault('o',0);
        int n=map.getOrDefault('n',0);

        int ans=b;

        ans=Math.min(ans,b);
        ans=Math.min(ans,a);
        ans=Math.min(ans,l/2);
        ans=Math.min(ans,o/2);
        ans=Math.min(ans,n);



        return ans;

        
        
    }
}
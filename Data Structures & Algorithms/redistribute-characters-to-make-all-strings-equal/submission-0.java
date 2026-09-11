class Solution {
    public boolean makeEqual(String[] words) {
       HashMap<Character,Integer>map=new HashMap<>();
        for(String word:words){
            for(char ch:word.toCharArray()){
               map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        for(char ch:map.keySet()){
            if(map.get(ch)%words.length!=0){
                return false;
            }
        }
        return true;
    }
}
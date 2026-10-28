class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int len=0;

        for(int freq:map.values()){
            len+=(freq/2)*2;
        }
        if(len<s.length()){
            len++;
        }
        
        return len;
    }
}
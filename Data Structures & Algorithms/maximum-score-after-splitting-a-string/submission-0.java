class Solution {
    public int maxScore(String s) {

        int one=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                one++;
            }
        }

        int zeros=0;
        int max=0;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zeros++;
            }
            else{
                one--;
            }

            max=Math.max(max,one+zeros);
        }
        return max;
        
    }
}
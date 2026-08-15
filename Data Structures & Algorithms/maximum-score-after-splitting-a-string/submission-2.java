class Solution {
    public int maxScore(String s) {

        int one=0;

        for(char ch:s.toCharArray()){
            if(ch=='1'){
                one++;
            }
        }

        int max=0;
        int zero=0;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
            else{
                one--;
            }

            max=Math.max(max,one+zero);

        }
        return max;
        
    }
}
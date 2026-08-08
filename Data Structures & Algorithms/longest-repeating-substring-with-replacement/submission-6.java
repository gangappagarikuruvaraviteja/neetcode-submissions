class Solution {
    public int characterReplacement(String s, int k) {
       
        int max=0;
      for(int target='A';target<='Z';target++){
          int changes=0;
          int left=0;

          for(int right=0;right<s.length();right++){
                if(s.charAt(right)!=target){
                  changes++;
                }

                while(changes>k){
                  if(s.charAt(left)!=target){
           
                  changes--;
                  }
 
                left++;
                }      
          max=Math.max(max,right-left+1);
          }
      }
      return max;
    }
}

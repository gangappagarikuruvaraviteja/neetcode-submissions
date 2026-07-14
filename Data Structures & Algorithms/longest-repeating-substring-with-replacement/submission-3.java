class Solution {
    public int characterReplacement(String s, int k) {
        

      int maxlength=0;
      for(char target='A';target<='Z';target++){

            int left=0;

            int changes=0;

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
                maxlength=Math.max(maxlength,right-left+1);
            }
      }
      return maxlength;


    }
}

class Solution {
    public int appendCharacters(String s, String t) {
   
       
          int i=0;

          for(char ch:s.toCharArray()){
               if(i<t.length() && ch==t.charAt(i)){
                    i++;
               }
          }
          return t.length()-i;
    }
}
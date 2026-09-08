class Solution {
    public int appendCharacters(String s, String t) {

     int i=0;
     int j=0;

     while(i<t.length() && j<s.length()){
          if(s.charAt(j)== t.charAt(i)){
               i++;
          }
          j++;
     }
     

     
     return t.length()-i;
        
    }
}
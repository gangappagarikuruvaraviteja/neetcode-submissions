class Solution {
    public String mergeAlternately(String word1, String word2) {

        int n=word1.length();
        int m=word2.length();

        char []ch=new char[n+m];

        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            ch[k++]=word1.charAt(i++);
            ch[k++]=word2.charAt(j++);
        }

        while(i<n){
            ch[k++]=word1.charAt(i++);

        }
        while(j<m){
            ch[k++]=word2.charAt(j++);
        }
        return new String(ch);
        
    }
}
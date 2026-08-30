class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white=0;
        for(int i=0;i<k;i++){
            char ch=blocks.charAt(i);
            if(ch=='W'){
                white++;
            }
        }
        int op=white;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W'){
                white--;
            }
            if(blocks.charAt(i)=='W'){
                white++;
            }
            op=Math.min(op,white);
        }  
        return op;
    }
}
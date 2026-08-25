class Solution {
    public int minimumRecolors(String blocks, int k) {

        int white=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                white++;
            }


        }
        int minop=white;

        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W'){
                white--;
            }
            if(blocks.charAt(i)=='W'){
                white++;
            }

            minop=Math.min(minop,white);
        }
        return minop;
        
    }
}
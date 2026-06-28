class Solution {
    public int minimumRecolors(String blocks, int k) {

         int whitecolors=0;

         for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
            whitecolors++;
         }
    }
         int minoperaton=whitecolors;

         for(int i=k;i<blocks.length();i++){

            if(blocks.charAt(i-k)=='W'){
                whitecolors--;
            }

            if(blocks.charAt(i)=='W'){
                whitecolors++;
            }

            minoperaton=Math.min(minoperaton,whitecolors);


        // return minoperaton; 
         }
                 return minoperaton; 

    }
}
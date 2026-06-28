class Solution {
    public int minimumRecolors(String blocks, int k) {

        int whiteCount = 0;

        // first window
        for(int i = 0; i < k; i++) {

            if(blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }

        int minOperations = whiteCount;

        // slide window
        for(int i = k; i < blocks.length(); i++) {

            // remove left character
            if(blocks.charAt(i - k) == 'W') {
                whiteCount--;
            }

            // add right character
            if(blocks.charAt(i) == 'W') {
                whiteCount++;
            }

            minOperations = Math.min(minOperations, whiteCount);
        }

        return minOperations;
    }
}
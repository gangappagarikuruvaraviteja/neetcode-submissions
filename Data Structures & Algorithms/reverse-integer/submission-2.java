class Solution {
    public int reverse(int x) {

        long dig = 0;

        while(x != 0) {

            long res = x % 10;

            dig = dig * 10 + res;

            x = x / 10;

            if(dig > Integer.MAX_VALUE || dig < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int)dig;
    }
}
class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = (start^goal);
        int counter = 0;
        while(xor!=0){
            if((xor&1) == 1){
                counter++;
            }
            xor = xor >> 1;
        }
        return counter;
    }
}
//https://leetcode.com/problems/minimum-bit-flips-to-convert-number/

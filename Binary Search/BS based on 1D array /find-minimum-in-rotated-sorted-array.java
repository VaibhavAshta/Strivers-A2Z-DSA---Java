class Solution {
    public int findMin(int[] nums) {
        int m = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(m > nums[i]){
                m = nums[i];
            }
        }
        return m;
    }
}
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public boolean check(int[] nums) {
        int check = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[check] <= nums[i]){
                check ++;
            }else{
                return false;
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

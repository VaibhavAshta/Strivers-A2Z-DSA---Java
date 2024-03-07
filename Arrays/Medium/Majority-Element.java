class Solution {
    public int majorityElement(int[] nums) {
        int val = 0, count = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                count = 1;
                val = nums[i];
            }

            else if(nums[i] == val){
                count++;
            }

            else{
                count--;
            }
        }
        return val;
    }
}
//https://leetcode.com/problems/majority-element/

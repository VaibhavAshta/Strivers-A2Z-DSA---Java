class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[positiveIndex] = nums[i];
                positiveIndex += 2; // Increment by 2 for positive integers
            } else {
                arr[negativeIndex] = nums[i];
                negativeIndex += 2; // Increment by 2 for negative integers
            }
        }
        return arr;
    }
}

//https://leetcode.com/problems/rearrange-array-elements-by-sign/

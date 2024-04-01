class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if ((m == 0 || nums[m] > nums[m - 1]) && (m == nums.length - 1 || nums[m] > nums[m + 1])) {
                return m; // m is a peak element
            } else if (m > 0 && nums[m] < nums[m - 1]) {
                r = m - 1; // search left
            } else {
                l = m + 1; // search right
            }
        }
        return -1; // no peak element found
    }
}
//https://leetcode.com/problems/find-peak-element/

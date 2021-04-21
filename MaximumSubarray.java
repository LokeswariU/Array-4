// Time Complexity : O(n) n - length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Compare curr element with the sum of previous elements
// again a second comparison of previous sum and max sum so far

class Solution {
    public int maxSubArray(int[] nums) {
        int curr =0;
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            curr = Math.max(nums[i],curr+nums[i]);
            max = Math.max(curr,max);
        }
        return max;
    }
}

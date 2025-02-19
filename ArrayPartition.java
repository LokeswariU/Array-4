// Time Complexity : O(n log n) sorting
// Space Complexity : O(log n) sorting take log n space internally
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum =0;
        for(int i=0;i<nums.length-1;i=i+2){
            sum += nums[i];
        }
        return sum;
    }
}

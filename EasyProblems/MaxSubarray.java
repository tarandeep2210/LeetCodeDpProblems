//Question Link : https://leetcode.com/problems/maximum-subarray/submissions/

class Solution {
    public int maxSubArray(int[] nums) {
        int dp[] = new int[nums.length];
        int maxSum = Integer.MIN_VALUE;
        
        if(nums.length==1){
            return nums[0];
        }
        
        dp[0] = nums[0];
        
        for(int i = 1 ; i<nums.length ; i++){
            dp[i] = Math.max(dp[i-1] + nums[i] , nums[i]);
        }
        
        for(int i = 0 ; i<nums.length ; i++){
           maxSum = Math.max(dp[i] , maxSum);
        }
        
        return maxSum;
    }
}

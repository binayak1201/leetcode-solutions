class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        if(nums.length==1)
            return nums[0];
        else if(nums.length==2)
        {
             dp[0]=nums[0];
            dp[1]=nums[1];
            return Math.max(dp[0],dp[1]);
        }
        else{
             dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            dp[i]=Math.max((nums[i]+dp[i-2]),dp[i-1]);
        }
        return dp[nums.length-1];
        }
    }
}

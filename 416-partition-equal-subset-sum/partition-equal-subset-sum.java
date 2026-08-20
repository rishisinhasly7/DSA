class Solution {
    public boolean canPartition(int[] nums) {
        int size = 0;
        for(int i=0;i<nums.length;i++){
            size += nums[i];
        }
        if(size%2 != 0){
            return false;
        }
        size /= 2;
        boolean[][] dp = new boolean[nums.length+1][size+1];

        dp[0][0] = true;
        for(int i = 1;i<size+1;i++){
            dp[0][i] = false;
        }
        for(int i = 1;i<nums.length+1;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<nums.length+1;i++){
            for(int j=1;j<size+1;j++){
                dp[i][j] = dp[i-1][j] || (j >= nums[i-1] && dp[i-1][j - nums[i-1]]);
            }
        }
        return dp[nums.length][size];
    }

}
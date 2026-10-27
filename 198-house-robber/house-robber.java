class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = nums[0];
        int max = Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        }

        for(int i=1;i<nums.length;i++){
            int take = prev1 + nums[i];
            int skip  = prev2;

            int ans = Math.max(take , skip);
            if(ans > max){
                max = ans;
            } 
            prev1 = prev2;
            prev2 = ans;
        }
        return max;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int w_sum = 0;
        int start = 0;
        for(int i=0;i<nums.length;i++){
            w_sum += nums[i];

        while(w_sum >= target){
            
                ans = Math.min(ans , i - start + 1);

                w_sum -= nums[start];
                
                start++;
            }
        }
        if(start == 0){
            return 0;
        }
        return ans;
    }
}
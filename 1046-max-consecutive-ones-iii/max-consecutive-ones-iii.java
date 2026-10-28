class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int onesCount = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                onesCount++;
            }
            
            if(i - start + 1 - onesCount > k){
                if(nums[start] == 1) onesCount--;
                start++;
            }
            ans = Math.max(ans , i - start + 1);
        }
        return ans;
    }
}
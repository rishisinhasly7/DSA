class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] maxArray = new int[nums.length];
        int[] minArray = new int[nums.length];

        int max = -1;
        int min = Integer.MAX_VALUE;
        int ans = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
            maxArray[i] = max;

            if(nums[nums.length - 1 - i] < min){
                min = nums[nums.length - 1 - i];
            }
            minArray[nums.length - 1 - i] = min;
        }
        
        for(int i = 0;i<nums.length;i++){
            int diff = maxArray[i] - minArray[i];
            if(diff <= k){
                if(ans == -1){
                    ans = i;
                }
                ans = Math.min(ans , i);
            }
        }

        return ans;
    }
}
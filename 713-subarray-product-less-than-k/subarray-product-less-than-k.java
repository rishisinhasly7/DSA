class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int start = 0, product = 1;
        int ans = 0;

        for(int i=0;i<nums.length;i++){
            product *= nums[i];

            while(product >= k && start < nums.length){
                product /= nums[start];
                start++;
            }

            
            for(int j = i ; j > start - 1;j--){
                ans++;
            }

        }
        return ans;
    }
    
}
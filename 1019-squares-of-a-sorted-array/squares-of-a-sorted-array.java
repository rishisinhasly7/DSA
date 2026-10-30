class Solution {
    public int[] sortedSquares(int[] nums) {
        int index_of_negative = 0;
        for(int num : nums){
            if(num < 0){
                index_of_negative++;
            }
        }
        int[] ans = new int[nums.length];
        int left = index_of_negative - 1;
        int right = index_of_negative;
        int index = 0;
        while(left >= 0 && right < nums.length){
            int k= nums[left] * nums[left];
            int l = nums[right] * nums[right];

            if(k < l){
                ans[index] = k;
                index++;
                left--;
            }else{
                ans[index] = l;
                index++;
                right++;
            }
        }
        while(left >= 0){
            int k= nums[left] * nums[left];
            ans[index] = k;
            index++;
            left--;
        }
        while(right < nums.length){
            int l = nums[right] * nums[right];
            ans[index] = l;
            index++;
            right++;
        }
        return ans;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int count_zero = 0;
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                ans[k] = nums[i];
                k++;
            }else{
                count_zero++;
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = ans[i];
        }
        
    }
}
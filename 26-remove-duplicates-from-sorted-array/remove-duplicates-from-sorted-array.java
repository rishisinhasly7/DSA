class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr1 = 1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[ptr1 - 1]){
                nums[ptr1] = nums[i];
                ptr1++;   
            }
        }
        return ptr1;
    }
}
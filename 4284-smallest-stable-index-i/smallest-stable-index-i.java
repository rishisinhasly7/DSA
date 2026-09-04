class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] maxArray =  new int[nums.length];
        int[] minArray = new int[nums.length];
        int max = -1;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i] , max);
            maxArray[i] = max;
            min = Math.min(nums[nums.length - 1 - i] , min);
            minArray[nums.length - 1 - i] = min;
        }

         for(int i=0;i<nums.length;i++){
            if(maxArray[i] - minArray[i] <= k){
                return i;
            }
         }
        return -1;
    }
}
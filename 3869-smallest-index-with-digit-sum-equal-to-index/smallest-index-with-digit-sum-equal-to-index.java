class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i == sum(nums[i])){
                return i;
            }
        }
        return -1;
    }

    public int sum(int a){
        int sum = 0;
        while(a != 0){
            int t = a%10;
            sum += t;
            a /= 10;
        }
        return sum;
    }
}
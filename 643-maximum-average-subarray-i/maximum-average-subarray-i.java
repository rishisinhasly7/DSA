class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_sum = -Double.MAX_VALUE;
        int start = 0;
        double w_sum = 0;
        for(int i=0;i<nums.length;i++){
            w_sum += nums[i];

            if(i >= k-1){
                double avg = w_sum/k;
                if(avg > max_sum){
                    max_sum = avg;
                }
                w_sum -= nums[start];
                start++;
            }
        }
        return max_sum;
    }
}
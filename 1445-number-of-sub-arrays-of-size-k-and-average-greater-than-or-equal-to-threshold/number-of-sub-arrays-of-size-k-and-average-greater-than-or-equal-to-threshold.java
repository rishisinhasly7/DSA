class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        for(int i=0;i<=arr.length-k;i++){
            if(Sum(arr , i , i+k-1) >= (k * threshold)){

                ans++;
            }
        }
        return ans;
    }
    public int Sum(int[] arr , int start , int end){
        int sum = 0;
        for(int i=start;i<=end;i++){
            sum += arr[i];
        }
        return sum;
    }
}
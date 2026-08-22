class Solution {
    public static int maxArea(int[] height) {
       int left = 0;
        int right = height.length - 1;
        int ans = 0;
        int max = Integer.MIN_VALUE;

        while(left < right){
            ans = (Math.min(height[left] , height[right])) * (right - left);
            if(ans > max){
                max = ans;
            }
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
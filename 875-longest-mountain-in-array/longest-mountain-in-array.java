class Solution {
    public int longestMountain(int[] arr) {
        int res = 0;

        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                int l = i;
                int r = i;
                while(l > 0 && arr[l-1] < arr[l] ){
                    l--;
                }
                while(r < arr.length-1 && arr[r+1] < arr[r] ){
                    r++;
                }
                res = Math.max(res , r -l +1);
            }
        }
        return res;
        
    }
}
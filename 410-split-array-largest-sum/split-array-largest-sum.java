class Solution {
    public int splitArray(int[] nums, int k) {

       int end = 0;
       int start = -1;
       for(int i =0;i<nums.length;i++){
        end = end + nums[i];
        if(nums[i] > start){
            start = nums[i];
        }
       }

    while(start < end){

        int mid = start + (end - start) / 2;
        int sum = 0;
        int pieces = 1;
        for(int num : nums){
            if(sum + num > mid){
                sum = num;
                pieces++;
            }else{
                sum += num;
            }
        }

        if(pieces > k){
            start = mid + 1;
        }else{
            end = mid;
        }


    }  
    return end;
       } 
     
    }

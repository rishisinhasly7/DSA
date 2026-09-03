class Solution {
    public boolean search(int[] nums, int target) {
        int pivotIndex = findPivot(nums);
        System.out.println("This is my Pivot "  + pivotIndex);
       if(pivotIndex == -1){
        return binarySearch(nums, target , 0 , nums.length - 1);
       }
        if(nums[pivotIndex] == target){
            return true;
        }

        if(target >= nums[0]){
            return binarySearch(nums ,target , 0 , pivotIndex - 1);
        }
        return binarySearch(nums ,target, pivotIndex + 1 ,nums.length - 1);
    }

    public static int findPivot(int[] nums){
        int start =  0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(mid  < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(nums[start] == nums[mid] && nums[end] == nums[mid]){
                if(start < end && nums[start] > nums[start + 1]){
                    return start;
                }start++;
                if(end > start && nums[end] < nums[end - 1]){
                    return end;
                }end--;     
            }else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid+1;
                System.out.println("Here ");

            }else{
                end = mid -1; 
                System.out.println("THere ");
            }
        }
        return -1;
    }

    public static boolean binarySearch(int[] nums , int target , int start , int end){

        while(start <= end){
            int mid = start + (end - start)/2;
             System.out.println("MId is ->" + mid + " ,Start-> " + start +" ,Ends ->" + end);
            if(nums[mid] > target){
                end = mid -1;
            }else if(nums[mid] < target){
                start = mid  + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
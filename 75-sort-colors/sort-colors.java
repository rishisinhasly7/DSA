class Solution {
    public void sortColors(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int i = 0;
         while(i <= high) {
             int temp = 0;
    if(arr[i] == 0) {
      
       temp = arr[i];
      arr[i] = arr[low];
      arr[low] = temp;
      
      i++;
      low++;
    } else if(arr[i] == 1){
      i++;
    } else{
     
      temp = arr[i];
      arr[i] = arr[high];
      arr[high] = temp;
     
      high--;
    }
  }
        
    }
}
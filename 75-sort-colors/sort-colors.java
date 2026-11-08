class Solution {
    public void sortColors(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int i = 0;
         while(i <= high) {
             int temp = 0;
    if(arr[i] == 0) {
      //swap
      //[arr[i], arr[low]] = [arr[low], arr[i]]
       temp = arr[i];
      arr[i] = arr[low];
      arr[low] = temp;
      //increment i and low
      i++;
      low++;
    } else if(arr[i] == 1){
      i++;
    } else{
      //the case for arr[i] === 2
      //swap
      // [arr[i], arr[high]] = [arr[high], arr[i]]
      temp = arr[i];
      arr[i] = arr[high];
      arr[high] = temp;
      //decrement high only, after the swap the number
      //at index i could be 0, 1, or 2
      high--;
    }
  }
        
    }
}
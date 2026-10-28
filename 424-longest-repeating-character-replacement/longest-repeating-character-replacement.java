class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash = new int[27];
        int start= 0 , ans = 0;
        int maximumLetterCount = 0;

        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i) - 'A';
            hash[ch]++;

            maximumLetterCount = Math.max(maximumLetterCount , hash[ch]);

            if(i - start + 1 - maximumLetterCount > k){
                hash[s.charAt(start) - 'A']--;
                
                start++;
            }
            ans = Math.max(ans , i - start + 1);
            }
            return ans;
    }
}
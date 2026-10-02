class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int l = 0;
        int[] hash = new int[3];
        for(int i = 0;i<s.length();i++){
            hash[s.charAt(i) - 'a']++;
            while(hash[0] > 0 && hash[1] > 0 && hash[2] > 0){
                ans = ans + (s.length() - i);
                hash[s.charAt(l)  -'a']--;
                l++;
            }
        }
    return ans;
    }

    
}
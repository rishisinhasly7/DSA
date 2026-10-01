class Solution {
    public String makeSmallestPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;
        int ans = 0;
        StringBuilder str = new StringBuilder(s);
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                if(s.charAt(l) < s.charAt(r)){
                   str.setCharAt(r , s.charAt(l));
                }else{
                    str.setCharAt(l , s.charAt(r));
                }
            }
            l++;
            r--;
        }
        return str.toString();
    }
}
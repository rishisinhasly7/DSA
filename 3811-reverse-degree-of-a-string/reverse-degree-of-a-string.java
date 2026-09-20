class Solution {
    public int reverseDegree(String s) {
        int num = 0;
        int sum = 0;
        for(int i=0;i<s.length();i++){
            num = (i+1) * (26 - ((int)(s.charAt(i)) - 97));
            sum += num;
        }
        return sum;
        
    }
}
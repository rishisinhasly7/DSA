class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int t = 0;
       int count = 0 , num = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }else{
                num++;
            }
        if(num == count){
        StringBuilder str = new StringBuilder(s.substring(t , i+1));
        str.deleteCharAt(0);
        str.deleteCharAt(str.length() - 1);
        ans = ans + str.toString();
        count = 0;
        num = 0;
        t = i+1;
        }   
    }
        return ans;
        
    }
}
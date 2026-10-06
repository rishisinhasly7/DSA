class Solution {
    public int minAddToMakeValid(String s) {
        int ans = s.length();

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                ans = ans - 2;
                stack.pop();
            }
        }
        return ans;
    }
}
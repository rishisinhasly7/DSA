class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int close_one = 0;
        int open_one = 1;
        return generate(ans , n , "(" ,open_one,close_one );
    }
    public List<String> generate(List<String> ans , int n , String para, int open ,int close){
        if(open == close && open == n){
            ans.add(para);
        }
        
        if(open > close && open < n){
            generate(ans , n ,para + "(" , open+1 ,close);
            generate(ans ,n , para+")" , open , close+1);
        }
        if(open == n && close <= open){
          generate(ans , n ,para + ")" , open ,close+1);   
        }
        if(open == close){
            generate(ans , n ,para + "(" , open+1 ,close);
        }
    return ans;

    }

}
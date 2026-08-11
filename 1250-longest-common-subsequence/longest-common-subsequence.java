class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
          int[][] dp =  new int[text2.length()+1][text1.length()+1];
        
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
         for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 0;
        }


        for(int i=1;i<dp.length;i++){
            char ch = text2.charAt(i-1);
            for(int j=1;j<dp[0].length;j++){
                dp[i][j] = (ch == text1.charAt(j-1)) ? 1+dp[i-1][j-1] : Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
    return dp[text2.length()][text1.length()];
        
    }
}                                                          
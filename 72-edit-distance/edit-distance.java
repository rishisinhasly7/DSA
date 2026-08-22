class Solution {
    public int minDistance(String word1, String word2) {
            int row = word2.length() + 1;
            int col = word1.length() + 1;
            int[][] dp = new int[row][col];
            for(int i = 0;i<row;i++){
                dp[i][0] = i;
            }
            for(int i = 0;i<col;i++){
                dp[0][i] = i;
            }

            for(int i=1;i<row;i++){
                for(int j=1;j<col;j++){
                    if(word2.charAt(i-1) == word1.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }else{
                        dp[i][j] = Math.min(dp[i-1][j] , Math.min(dp[i][j-1] , dp[i-1][j-1])) + 1;
                    }
                }
            }
        return dp[row-1][col-1];
    }
}
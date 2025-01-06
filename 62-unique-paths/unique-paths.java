class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int k=0;k<m;k++){
            Arrays.fill(dp[k],-1);
        }
        int ans= path(m,n,0,0,dp);
        return ans;
    }
    public static int path(int m, int n,int i, int j, int[][] dp){
        if (i==m-1 && j==n-1){
            return 1;
        }
        if (i>m-1 ||j>n-1){
            return 0;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int right = path(m, n, i, j + 1, dp);
        int bottom = path(m, n, i + 1, j, dp);
        return dp[i][j]= right+bottom;
    }
}
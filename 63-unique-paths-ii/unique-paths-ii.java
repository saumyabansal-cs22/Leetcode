class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m= obstacleGrid.length;
        int n= obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int k=0;k<m;k++){
            Arrays.fill(dp[k],-1);
        }
        int ans= path(m,n,obstacleGrid,0,0,dp);
        return ans;
        
    }
    public static int path(int m, int n,int[][] arr, int i, int j, int[][] dp){
        if (i>m-1 ||j>n-1){
            return 0;
        }
        if (arr[i][j]==1){
            return 0;
        }
        if (i==m-1 && j==n-1){
            return 1;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int right = path(m, n,arr, i, j + 1, dp);
        int bottom = path(m, n,arr, i + 1, j, dp);
        return dp[i][j]= right+bottom;
    }
}
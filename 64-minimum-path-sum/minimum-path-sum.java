class Solution {
    public int minPathSum(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int[][] dp = new int[m][n];
        for(int k=0;k<m;k++){
            Arrays.fill(dp[k],-1);
        } 
        int ans= path_Sum(grid, 0,0,dp);
        return ans;
    }
    public static int path_Sum(int[][] grid, int i, int j, int[][] dp){
        int m= grid.length;
        int n= grid[0].length;
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        if (i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=path_Sum(grid,i,j+1,dp);
        int down=path_Sum(grid,i+1,j,dp);
        return dp[i][j]= Math.min(right,down)+grid[i][j];
    }
}
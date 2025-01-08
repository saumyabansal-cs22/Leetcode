class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        // Create a dp array to store the minimum falling path sum
        int[][] dp = new int[n][m];
        
        // Base case: Fill the last row of dp with the last row of the matrix
        for (int j = 0; j < m; j++) {
            dp[n - 1][j] = matrix[n - 1][j];
        }
        
        // Build the dp table from the second-last row to the top row
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                int down = dp[i + 1][j]; // Down
                 int ld = Integer.MAX_VALUE; // Default value for left diagonal
                int rd = Integer.MAX_VALUE;
                if (j>0) {
                    ld = dp[i + 1][j - 1]; 
                    }// Left Diagonal
                if (j+1<m) {
                    rd = dp[i + 1][j + 1];  // Right Diagonal
            }
                dp[i][j] = matrix[i][j] + Math.min(down, Math.min(ld, rd));
            }
        }
        
        // Find the minimum value in the first row of dp
        int ans = Integer.MAX_VALUE;
        for(int j = 0; j < m; j++) {
            ans = Math.min(ans, dp[0][j]);
        }
        
        return ans;
    }
}

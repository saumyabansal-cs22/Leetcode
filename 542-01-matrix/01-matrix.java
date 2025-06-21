class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] res = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

        int[] deltar = {-1, 0, 1, 0};
        int[] deltac = {0, 1, 0, -1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new int[]{i, j});
                    vis[i][j] = true;
                }
            }
        }
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];

            for (int i = 0; i < 4; i++) {
                int nrow = row + deltar[i];
                int ncol = col + deltac[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !vis[nrow][ncol]) {
                    res[nrow][ncol] = res[row][col] + 1;
                    vis[nrow][ncol] = true;
                    q.offer(new int[]{nrow, ncol});
                }
            }
        }

        return res;
    }
}

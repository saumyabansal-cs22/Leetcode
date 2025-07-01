import java.util.*;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0 || grid[n-1][n-1] != 0) return -1;

        int[] deltar = {-1,-1,-1,0,1,1,1,0};
        int[] deltac = {-1,0,1,1,1,0,-1,-1};

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1}); // row, col, distance
        grid[0][0] = 1; // mark visited

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int row = cur[0], col = cur[1], dist = cur[2];

            if (row == n-1 && col == n-1) return dist;

            for (int i = 0; i < 8; i++) {
                int nrow = row + deltar[i];
                int ncol = col + deltac[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < n && grid[nrow][ncol] == 0) {
                    q.add(new int[]{nrow, ncol, dist + 1});
                    grid[nrow][ncol] = 1; // mark as visited
                }
            }
        }

        return -1; // no path found
    }
}

import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];

        Queue<Triple> q = new LinkedList<>();
        int cntFresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    vis[i][j] = 2;
                    q.add(new Triple(i, j, 0)); // enqueue rotten orange with time = 0
                } else if (grid[i][j] == 1) {
                    cntFresh++;
                }
            }
        }

        int tm = 0;
        int[] deltar = {-1, 0, 1, 0};
        int[] deltac = {0, 1, 0, -1};
        int cnt = 0;

        while (!q.isEmpty()) {
            Triple curr = q.poll();
            int row = curr.row;
            int col = curr.col;
            int time = curr.time;

            tm = Math.max(tm, time);

            for (int i = 0; i < 4; i++) {
                int nrow = row + deltar[i];
                int ncol = col + deltac[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                        && grid[nrow][ncol] == 1 && vis[nrow][ncol] == 0) {
                    q.add(new Triple(nrow, ncol, time + 1));
                    vis[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }

        if (cnt != cntFresh) return -1;
        return tm;
    }
}

class Triple {
    int row;
    int col;
    int time;

    public Triple(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

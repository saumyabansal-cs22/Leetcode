class Pair{
    int first;
    int second;
    public  Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis= new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (vis[i][j]==0 && grid[i][j]=='1'){
                    cnt++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
    public static void bfs(int row,int col,int[][] vis, char[][] grid){
        vis[row][col]=1;
        Queue<Pair> q= new LinkedList<Pair>();
        q.add(new Pair(row,col));
        int n= grid.length;
        int m= grid[0].length;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!q.isEmpty()){
            int ro= q.peek().first;
            int co=q.peek().second;
            q.remove();
            for (int i = 0; i < 4; i++) {
                int nrow = ro + drow[i];
                int ncol = co + dcol[i];
                    if (nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                    && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                
            }
        }
    }
}
class Solution {
    public void solve(char[][] board) {
        int n= board.length;
        int m= board[0].length;
        int[][] vis= new int[n][m];
        int[] deltar={-1,0,1,0};
        int[] deltac={0,1,0,-1};
        //first row and last row
        for(int j=0;j<m;j++){
            //first row
            if (vis[0][j]==0 && board[0][j]=='O'){
                dfs(0,j,vis,board,deltar,deltac);
            }
            //last row
            if (vis[n-1][j]==0 && board[n-1][j]=='O'){
                dfs(n-1,j,vis,board,deltar,deltac);
            }
        }
        //first col and last col
        for(int i=0;i<n;i++){
            //first col
            if (vis[i][0]==0 && board[i][0]=='O'){
                dfs(i,0,vis,board,deltar,deltac);
            }
            //last col
            if (vis[i][m-1]==0 && board[i][m-1]=='O'){
                dfs(i,m-1,vis,board,deltar,deltac);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (vis[i][j]==0 && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }

    }
    public static void dfs(int row, int col, int[][] vis,
    char[][] board, int[] deltar, int[] deltac){
        vis[row][col]=1;
        int n= board.length;
        int m = board[0].length;
        for(int i=0;i<4;i++){
            int nrow = row+deltar[i];
            int ncol= col+deltac[i];
            if (nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
            board[nrow][ncol]=='O' && vis[nrow][ncol]==0){
                dfs(nrow,ncol,vis,board,deltar,deltac);
            }
        }
        
    }
}
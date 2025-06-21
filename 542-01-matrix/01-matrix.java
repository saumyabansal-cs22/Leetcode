class Triple{
    int first;
    int second;
    int third;
    public Triple(int first, int second, int third){
        this.first=first;
        this.second=second;
        this.third=third;   
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n= mat.length;
        int m= mat[0].length;
        int[][] vis= new int[n][m];
        int[][] dist= new int[n][m];
        Queue<Triple> q= new LinkedList<Triple>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (mat[i][j]==0){
                    q.add(new Triple(i,j,0));
                    vis[i][j]=1;
                }
                else{
                    vis[i][j]=0;
                }
            }
        } 
        int[] deltar= {-1,0,1,0};
        int[] deltac= {0,1,0,-1};

        while(!q.isEmpty()){
            Triple rr= q.peek();
            int row= rr.first;
            int col= rr.second;
            int steps= rr.third;
            q.remove();
            dist[row][col]=steps;
            for(int i=0;i<4;i++){
                int nrow= row+deltar[i];
                int ncol= col+deltac[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new Triple(nrow, ncol,steps+1));
                }
            }
        }
        return dist;  
    }
}
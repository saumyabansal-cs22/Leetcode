class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
           int n=image.length;
           int m= image[0].length;
           int originalcolor= image[sr][sc];
           if (originalcolor == color) return image;
           int[] deltar= {-1,0,1,0};
           int[] deltac={0,1,0,-1};
        //    int[][] vis=new int[n][m];
           dfs(image,sr,sc,deltar,deltac,originalcolor,color);
           return image;
    }
    public static void dfs(int[][] image,int row, int col, int[] deltar, int[] deltac ,int originalcolor,int color ){
        image[row][col]=color;
        int n= image.length;
        int m= image[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+deltar[i];
            int ncol= col+deltac[i];
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m
            && image[nrow][ncol]==originalcolor){
                dfs(image,nrow,ncol,deltar,deltac,originalcolor,color);
                // image[row][col]=2;
            }
        }
    }
}
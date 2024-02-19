class Solution {
    public boolean exist(char[][] board, String word) {
           for(int i=0;i<board.length;i++){
               for(int j=0;j<board[0].length;j++){
                   if (board[i][j]==word.charAt(0)){
                       boolean ans= Searchf(board,i,j,word,0);
                       if (ans==true){
                           return true;
                       }
                   }
               }
           }
           return false;
    }

    public static boolean Searchf(char[][] board, int cr, int cc, String word, int idx){
        if (idx==word.length()){
            return true;
        }


    if (cc<0||cr<0||cr>=board.length||cc>=board[0].length||word.charAt(idx)!=board[cr][cc]){
        return false;
    }
    board[cr][cc]='*';
    int[] r={-1,0,1,0};
    int[] c={0,-1,0,1};
    for(int i=0;i<r.length;i++){
        boolean ans= Searchf(board, cr+r[i], cc+c[i],word,idx+1);
        if (ans==true){
            return true;
        }
    }
    board[cr][cc]=word.charAt(idx);
    return false;
    }
}
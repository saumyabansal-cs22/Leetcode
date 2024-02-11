class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]==-1){
                    matrix[i][j]=function(matrix,j);
                }
            }
        }
        return matrix;
        
    }
    public static int function(int[][] arr, int ci){
        int maxi= Integer.MIN_VALUE;
        
    for(int k=0;k<arr.length;k++){
            if (arr[k][ci] >maxi) {
                maxi= arr[k][ci];
            }
        }
        
        return maxi;
    }
}
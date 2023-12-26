class Solution {
   public void rotate(int[][] arr) {
        Transpose(arr);
        reverse_row(arr);
    }
    public static void Transpose(int[][] arr){
        for (int row=0;row<arr[0].length;row++){
            for (int col=row+1;col< arr[0].length;col++){
                int temp=arr[row][col];
                arr[row][col]=arr[col][row];
                arr[col][row]=temp;
            }
        }

    }
    public static void reverse_row(int[][] arr){
        int len=arr.length;
        for (int i = 0; i < len ; i++) {
            for (int j = 0;j<len/2; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[i][len-1-j];
                arr[i][len-1-j]=temp;
            }
            
        }
    }
}
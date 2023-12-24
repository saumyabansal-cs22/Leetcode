class Solution {
    public boolean searchMatrix(int[][] arr, int item) {   
        int r=arr.length-1;
        int c=0;
        while(r>=0 && c<arr[0].length){
            if (arr[r][c]==item){
                return true;
            }
            else if(arr[r][c]>item){
                r--;
            }
            else {
                c++;
            }
        }
        return false;
    }
}
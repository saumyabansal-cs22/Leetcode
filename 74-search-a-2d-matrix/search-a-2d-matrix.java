class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int row=0;
        int col=nums[0].length-1;
        while(col>=0 &&row<=nums.length-1){
            if(nums[row][col]==target){
                return true;
            }
            else if (nums[row][col]>target){
                col--;
            }
            else
            row++;
        }
        return false;

    }
}
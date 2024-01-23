class Solution {
    public int removeDuplicates(int[] nums) {
        int c=1;
        int d=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]==nums[i-1]){
                d++;
            }
            else{
                d=1;
            }
            if (d<3){
                nums[c]=nums[i];
                c++;
            }

        }
        return c;
    }
}
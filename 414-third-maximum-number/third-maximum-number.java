class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3){
            return nums[nums.length-1];
        }
        int c=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=nums[i-1]){
                nums[c]=nums[i];
                c++;
            }

        }
       
        if (c<3)
        return nums[nums.length-1];
        return nums[c-3];
    }
    
}
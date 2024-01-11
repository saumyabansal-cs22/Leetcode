class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=-1;
        int counter=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==1){
                counter++;
                max=Math.max(counter,max);
            }
            else{
                counter=0;
            }
            
        }
        return Math.max(max,counter);
    }
}
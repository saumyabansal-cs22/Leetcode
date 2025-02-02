class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum= Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int currmax=0;
        int currmin=0;
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        currmax= Math.max(num+currmax, num);
        maxsum= Math.max(currmax,maxsum);
        currmin= Math.min(num+currmin, num);
        minsum= Math.min(currmin,minsum);
        }
        if (maxsum>0){
            return Math.max(maxsum, totalsum-minsum);
        }

        return maxsum;
    }
}
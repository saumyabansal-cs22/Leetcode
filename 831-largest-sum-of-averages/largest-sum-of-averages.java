class Solution {
  public double largestSumOfAverages(int[] nums, int k) {
    int n = nums.length;
    Double[][] dp = new Double[n][k];
    return divide(nums, 0, n, k-1, dp);
  }
  
  public double divide(int[] nums, int start, int end, int k, Double[][] dp) {
    if(start >= end) return 0;
    if(dp[start][k] != null) return dp[start][k];
    if(k == 0) {
      double lastPartitionSum = 0;
      for(int j = start; j < end; j++) {
        lastPartitionSum += nums[j];
      }
      return lastPartitionSum / (end - start);
    }
    
    double max = 0;
    for(int i = start+1; i < end; i++) { // try to split at every single index > start
      double res = divide(nums, i, end, k-1, dp);
      
      double currPartitionSum = 0;
      for(int j = start; j < i; j++) { // get the average of the partition we just tried to make
        currPartitionSum += nums[j];
      }
      double avg = currPartitionSum / (i - start); 
      max = Math.max(res + avg, max); // optimal substructure, find the best partition at each index
    }
    dp[start][k] = max;
    return max;    
  }
}
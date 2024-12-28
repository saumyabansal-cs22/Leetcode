class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];  // Handle single house case
        
        // Case 1: Rob houses from index 0 to n-2 (exclude the last house)
        int[] dp1 = new int[n];  
        Arrays.fill(dp1, -1);
        int a = maxMoney(nums, 0, n - 2, dp1);
        
        // Case 2: Rob houses from index 1 to n-1 (exclude the first house)
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int b = maxMoney(nums, 1, n - 1, dp2);
        
        return Math.max(a, b);
    }
    public int maxMoney(int[] arr, int index,int t, int[] dp){
        if (index > t) {
            return 0;  // Base case: if index is out of the range
        }
        if (dp[index] != -1) {
            return dp[index];  // Return the computed result if already computed
        }
        
        // Calculate the maximum value for robbing the current house or skipping it
        int choose = arr[index] + maxMoney(arr, index + 2, t, dp);
        int notChoose = maxMoney(arr, index + 1, t, dp);
        
        dp[index] = Math.max(choose, notChoose);  // Store the result in dp
        return dp[index];
    }
}

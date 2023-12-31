class Solution {
    public int trap(int[] height) {
        return trapping(height);
    }
     public static int trapping(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]); //max is an inbuilt function in java which return us the maximum value between two numbers
        }
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for (int i = n-2;i>=0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]); //max is an inbuilt function in java which return us the maximum value between two numbers
        }
        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+Math.min(left[i],right[i])-arr[i];
        }
        return sum;
    }
}
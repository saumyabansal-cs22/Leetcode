class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = Integer.MIN_VALUE;
        int area = 0;
        for (int[] arr : dimensions) {
            int ans = diagonal(arr[0], arr[1]); // squared diagonal
            if (ans > max) {
                max = ans;
                area = arr[0] * arr[1];
            } else if (ans == max) {
                area = Math.max(area, arr[0] * arr[1]);
            }
        }
        return area;
    }

    public int diagonal(int a, int b) {
        return a * a + b * b; // squared diagonal (no sqrt)
    }
}

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = Integer.MIN_VALUE;
        int area = 0;
        
        for (int[] arr : dimensions) {
            int diagSq = arr[0] * arr[0] + arr[1] * arr[1]; // squared diagonal
            if (diagSq > max) {
                max = diagSq;
                area = arr[0] * arr[1];
            } else if (diagSq == max) {
                // if diagonals are equal, choose rectangle with larger area
                area = Math.max(area, arr[0] * arr[1]);
            }
        }
        
        return area;
    }
}

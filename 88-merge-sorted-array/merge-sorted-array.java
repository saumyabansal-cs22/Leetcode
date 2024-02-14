class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        mergef(nums1, nums2, m, n);
    }
    
    public static void mergef(int[] a, int[] b, int m, int n) {
        int[] ans = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                ans[k] = a[i];
                i++;
            } else {
                ans[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            ans[k] = a[i];
            i++;
            k++;
        }
        while (j < n) {
            ans[k] = b[j];
            j++;
            k++;
        }
        // Copy the merged array back to nums1
        for (int p = 0; p < m + n; p++) {
            a[p] = ans[p];
        }
    }
}

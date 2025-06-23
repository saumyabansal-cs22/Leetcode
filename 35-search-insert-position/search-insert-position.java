class Solution {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;
        int[] arr= new int[n+1];
        arr[n]=target;
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);

        int index = -1;  // default if not found

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }
}
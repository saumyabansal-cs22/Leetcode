class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int[] newarr= new int[l1+l2];
        for(int i=0;i<l1;i++){
            newarr[i]=nums1[i];
        }
        for(int i=0;i<l2;i++){
            newarr[l1+i]=nums2[i];
        }
        Arrays.sort(newarr);
        int start=0;
        int end=newarr.length;
        int mid=start+(end-start)/2;
        if (newarr.length%2==0){
            return (double)(newarr[mid]+newarr[mid-1])/2;
        }
        else{
            return (double)newarr[mid];
        }
    }
}
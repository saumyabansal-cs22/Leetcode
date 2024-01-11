class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans=new ArrayList<>();
        int r1=0;
        int r2 = arr.length-1;
        int c1=0;
        int c2=arr[0].length-1;
        int length=arr.length*arr[0].length;
        int counter=0;
        while(counter<length) {
            for (int i = c1; i <= c2 && counter<length; i++) {
                ans.add(arr[r1][i]);
                counter++;
            }
            r1++;
            for (int i = r1; i <= r2 && counter<length; i++) {
                ans.add(arr[i][c2]);
                counter++;
            }
            c2--;
            for (int i = c2; i >= c1 && counter<length; i--) {
                ans.add(arr[r2][i]);
                counter++;
            }
            r2--;
            for (int i = r2; i >= r1 && counter<length; i--) {
                ans.add(arr[i][c1]);
                counter++;
            }
            c1++;
        }
        return ans;   
    }
}
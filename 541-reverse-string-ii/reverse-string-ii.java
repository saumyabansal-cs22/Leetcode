class Solution {
    public String reverseStr(String s, int k) {
       char[] charArray= s.toCharArray();
       int n=charArray.length;
       if (n==1)
       return new String(charArray);
       for(int i=0;i<n;i=i+2*k){
            int end = Math.min(i + k - 1, n - 1);

            // Reverse the first k characters
            // while (i < end) {
                // char temp = charArray[i];
                // charArray[i] = charArray[i+1];
                // charArray[i+1] = temp;
                // i++;
                // end--;
            // }
            
            reverse(charArray,i,end);
       }
        return new String(charArray);
    }
    public static char[] reverse(char[] arr,int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    
}
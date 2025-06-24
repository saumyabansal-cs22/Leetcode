class Solution {
    public boolean isSubsequence(String s, String t) {
        int n= t.length();
        int p=0;
        int j=0;
        while(j<n && p<s.length()){
            if (t.charAt(j)==s.charAt(p)){
                p++;
            }
                j++;
            
        }
        if (p==s.length()){
            return true;
        }
        return false;
    }

}
class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int n= s.length();
        int[] lastseen= {-1,-1,-1};
        for(int i=0;i<n;i++){
            lastseen[s.charAt(i)-'a']=i;
            if (lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1){
                count=count+1+Math.min(lastseen[2],(Math.min(lastseen[0],lastseen[1])));
            }
        }
        return count;
    }
}
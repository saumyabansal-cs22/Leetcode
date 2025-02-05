class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // if (s1.length() != s2.length()){
        //     return false;
        // }
        List<Character> ll= new ArrayList<>();
        // for(int i=0;i<s1.length();i++){
        //     ll.add(s1.charAt(i));
        // }
        int count=0;
        for(int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                ll.add(s1.charAt(i));
                ll.add(s2.charAt(i));
                count++;
            }
        }
        if ((count==0) || ((count ==2) && (ll.get(0)==ll.get(3)) && (ll.get(1)==ll.get(2)))){
            return true;
        }
        return false;
    }
}
class Solution {
    public String clearDigits(String s) {
        // Stack<Character> st= new Stack<>();
        StringBuilder str= new StringBuilder(s);
        for(int i=0;i<str.length();i++){
            int ascii= (int)str.charAt(i);
            if (ascii>=48 && ascii<=57){
                str=str.delete(i-1,i+1);
                i=i-2;
            }
        }
        return str.toString();
    }
}
class Solution {
    public int compress(char[] chars) {
        int write = 0;   // position to write compressed characters
        int count = 1;

        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                // write the previous character
                chars[write++] = chars[i - 1];
                // if count > 1, write digits of count
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                count = 1; // reset for next group
            }
        }
        return write; // new length
    }
}

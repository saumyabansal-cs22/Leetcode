class Solution {
    public String getHint(final String secret, final String guess) {
        final int[] numbers = new int[10];

        int cows = 0, bulls = 0;

        for(int i = 0; i < secret.length(); ++i) {
            final int s = secret.charAt(i) - '0', g = guess.charAt(i) - '0';

            if(s == g) {
                bulls++;
            } else {
                if(numbers[s] < 0)
                    cows++;
                if(numbers[g] > 0)
                    cows++;
                numbers[s]++;
                numbers[g]--;
            }
        }

        return bulls + "A" + cows + "B";
    }
}
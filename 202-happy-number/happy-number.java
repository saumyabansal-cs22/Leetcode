class Solution {
    public boolean isHappy(int n) {
        int num = n;
        
        // ❌ mistake: loop condition (stops too early)
        // while(num/10 != 0){
        //     num = squareofdigits(num);
        // }

        // ✅ change 1: keep running until num becomes 1 OR num repeats (cycle)
        HashSet<Integer> seen = new HashSet<>();
        while(num != 1 && !seen.contains(num)){
            seen.add(num);
            num = squareofdigits(num);
        }
        return num == 1;
    }

    public int squareofdigits(int n){
        int square = 0;
        while(n != 0){
            int r = n % 10;
            square = square + r * r;
            n = n / 10;
        }
        return square;
    }
}

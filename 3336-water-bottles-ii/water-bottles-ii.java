class Solution {
    public int maxBottlesDrunk(int num_Bottles, int num_Exchange) {
        int drunk_bottles = num_Bottles;
        int empty_bottles = num_Bottles;
        while (empty_bottles >= num_Exchange) {
            empty_bottles -= num_Exchange;
            empty_bottles++;
            drunk_bottles++;
            num_Exchange++;
        }
        return drunk_bottles;
    }
}
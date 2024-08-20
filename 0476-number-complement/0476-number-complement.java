class Solution {
    public int findComplement(int num) {
        // Calculate the bit mask (a number with all bits set to 1 for the bit length of num)
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        
        // XOR the number with the mask to flip its bits
        return num ^ mask;
    }
}

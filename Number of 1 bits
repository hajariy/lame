public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        
        // Iterate while there are still set bits in n
        while (n != 0) {
            n = n & (n - 1);  // Remove the least significant set bit
            count++;           // Increment the count for each set bit
        }
        
        return count;  // Return the total number of set bits
    }
}

public class Solution {
    public boolean isPalindrome(int x) {
        // If x is negative or ends with a zero (but is not zero), it's not a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversedHalf = 0;
        // Reverse the second half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10; // Get the last digit and add it to the reversed half
            x /= 10; // Remove the last digit from x
        }
        
        // Check if the first half is equal to the second half (reversed)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}

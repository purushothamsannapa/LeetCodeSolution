class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit (right to left)
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No more carry needed, return early
            }
            // If the digit is 9, it becomes 0, and loop carries over to the next digit
            digits[i] = 0;
        }
        
        // If we reach here, all digits were 9 (e.g., [9, 9, 9] becomes)
        // We need an extra space for the leading 1 (e.g., [1, 0, 0, 0])
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Remaining indices default to 0 automatically
        
        return newDigits;
    }
}

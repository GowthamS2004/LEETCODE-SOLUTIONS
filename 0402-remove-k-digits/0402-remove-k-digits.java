import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        if (num == null || num.length() == 0) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();
        
        // Iterate over each digit
        for (char c : num.toCharArray()) {
            // Remove digits from stack if the current digit is smaller
            // and we still need to remove more digits (k > 0)
            while (k > 0 && !stack.isEmpty() && stack.peek() > c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        // Remove any remaining digits from the end if k > 0
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        
        // Build the result from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        // Convert result to string and remove leading zeros
        String resultStr = result.toString().replaceFirst("^0+", "");
        
        // If result is empty, return "0"
        return resultStr.isEmpty() ? "0" : resultStr;
    }
}

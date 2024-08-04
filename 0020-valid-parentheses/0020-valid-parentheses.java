import java.util.ArrayList;

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        ArrayList<Character> ch = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                ch.add(currentChar);
            } else if (currentChar == ')') {
                if (ch.isEmpty() || ch.remove(ch.size() - 1) != '(') {
                    return false;
                }
            } else if (currentChar == ']') {
                if (ch.isEmpty() || ch.remove(ch.size() - 1) != '[') {
                    return false;
                }
            } else if (currentChar == '}') {
                if (ch.isEmpty() || ch.remove(ch.size() - 1) != '{') {
                    return false;
                }
            }
        }
        return ch.isEmpty();
    }
}

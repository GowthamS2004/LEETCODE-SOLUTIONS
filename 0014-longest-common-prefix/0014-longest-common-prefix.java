class Solution {
    public String longestCommonPrefix(String[] strs) {
        int j = -1;
        boolean continueLoop = true;
        
        while (continueLoop) {
            for (int i = 0; i < strs.length; i++) {
                String c = strs[i];
                if (j + 1 >= c.length() || (i > 0 && c.charAt(j + 1) != strs[i - 1].charAt(j + 1))) {
                    continueLoop = false;
                    break;
                }
            }
            j++;
        }
        
        if (j == -1) {
            return "";
        }
        return strs[0].substring(0, j);
    }
}

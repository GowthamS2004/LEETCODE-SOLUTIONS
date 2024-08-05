import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        // Step 1: Use a HashMap to count occurrences
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String s : arr) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        
        // Step 2: Collect strings that appear exactly once
        ArrayList<String> li = new ArrayList<>();
        for (String s : arr) {
            if (countMap.get(s) == 1 && !li.contains(s)) {
                li.add(s);
            }
        }
        
        // Step 3: Return the k-th distinct string if it exists
        if (k <= li.size()) {
            return li.get(k - 1);
        } else {
            return ""; // Handle the case where k is out of bounds
        }
    }
}

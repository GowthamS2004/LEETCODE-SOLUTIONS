/*class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(s.length()==0){return 0;}
        int max=1;
       ArrayList<Character>li=new ArrayList<>();
       li.add(s.charAt(0));
       for(int i=1;i<s.length();i++)
       {
        if(li.contains(s.charAt(i)))
        {
           li.clear();
           li.add(s.charAt(i));
        }
        else
        {
            li.add(s.charAt(i));
            if(max<li.size())
            {
                max=li.size();
            }
        }
       }
       return max;
    }
}*/
import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0; // Handle empty string case
        
        int max = 0; // Initialize to 0 to handle cases where the string might be empty
        ArrayList<Character> li = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            
            while (li.contains(currentChar)) {
                li.remove(0); // Remove the oldest character from the list
            }
            
            li.add(currentChar);
            if (max < li.size()) {
                max = li.size();
            }
        }
        
        return max;
    }
}

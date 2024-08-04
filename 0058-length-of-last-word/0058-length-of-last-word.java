class Solution {
    public int lengthOfLastWord(String s)
     {
        String []ss=s.split(" ");
        int n=ss.length;
        String x=ss[n-1];
        return x.length();
        
    }
}
class Solution {
    public String reverseWords(String s)
     {
       s= s.trim();
       String[]ss=s.split("\\s+");
        int n=ss.length;
        String[]x=new String[n];
        for(int i=0;i<n;i++)
        {
            x[i]=ss[n-i-1];
        }
        String xx=String.join(" ",x);
        return xx;
    }
}
class Solution {
    public boolean isPalindrome(String s) 
    {
        String ss="";
        String xx="";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
               ss=ss+Character.toLowerCase(c);
            }
            else
            {
                
            }
        }
        for(int i=ss.length()-1;i>=0;i--)
        {
            xx=xx+ss.charAt(i);
        }
        return ss.equals(xx);
        
    }
}
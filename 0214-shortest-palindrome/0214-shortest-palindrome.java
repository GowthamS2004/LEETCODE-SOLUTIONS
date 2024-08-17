class Solution {
    public String shortestPalindrome(String s) {
        int n=s.length();
        if(n==0){return s;}
        if(isPal(s)){return s;}
        // find the length of largest pal
        // if there is no pal i=1 
        //else i=last index of largest pal
        int i=largest_pal_length(s);
        String r=rev(s.substring(i));

         // int i=1;
        /*  while(!isPal(s))
          {
             s=s.charAt(i)+s;
             i+=2;
          }*/

        return r+s;
       
    }
    public boolean isPal(String str)
    {
        int s=0,e=str.length()-1;
        while(s<e)
        {
            if(str.charAt(s)!=str.charAt(e))
            {
                return false;
            }
            s++;e--;
        }
        return true;

    }
    public int largest_pal_length(String str)
    {
        int n=str.length();
        for(int i=n;i>=1;i--)
        {
            if(isPal(str.substring(0,i)))
            {
                return i;
            }
        }
        return 1;
    }

    //reverse
    public String rev(String str)
    {
         String reversed = new StringBuilder(str).reverse().toString();
          return reversed; 
    }
}
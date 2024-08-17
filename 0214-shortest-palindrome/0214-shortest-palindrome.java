class Solution {
    public String shortestPalindrome(String s) {
        int n=s.length();
        
        if( n==0 || isPal(s)){return s;}
        // find the length of largest pal
        // if there is no pal i=1 
        //else i=last index of largest pal
        int i=largest_pal_length(s);
        String r=rev(s.substring(i));  // instead of adding one by one, added the reverse 

         // int i=1;
        /*  while(!isPal(s))    //adding one by one
          {          
             s=s.charAt(i)+s;
             i+=2;
          }*/         

        return r+s;
       
    }
    //
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
    //    
    public int largest_pal_length(String str)
    {
      String reversedStr = new StringBuilder(str).reverse().toString();
    String combinedStr = str + "#" + reversedStr;
    int n = str.length();
    int[] lps = new int[combinedStr.length()];
    
    // Build LPS array for KMP algorithm
    int len = 0;  // Length of the previous longest prefix suffix
    int i = 1;    // Index in combinedStr
    
    while (i < combinedStr.length()) {
        if (combinedStr.charAt(i) == combinedStr.charAt(len)) {
            len++;
            lps[i] = len;
            i++;
        } else {
            if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
    }
    
    // The length of the longest palindromic prefix
    return lps[combinedStr.length() - 1];
     
    }

    //reverse
    public String rev(String str)
    {
         String reversed = new StringBuilder(str).reverse().toString();
          return reversed; 
    }
}
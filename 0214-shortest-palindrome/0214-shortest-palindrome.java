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
      String s=str+"#"+rev(str);
      int i=0;
      int j=1;
      
      int[]lps=new int[s.length()];
     while(i<str.length() && j<s.length())
     {
         if(s.charAt(i)==s.charAt(j))
         {
            i++;
            lps[j]=i;
            j++;
         }
         else
         {
            if(i!=0)
            {
                i=lps[i-1];
            }
           else {
                lps[j] = 0;
                j++;
            }
         }
      }
      return lps[s.length()-1];
      
     
    }

    //reverse
    public String rev(String str)
    {
         String reversed = new StringBuilder(str).reverse().toString();
          return reversed; 
    }
}
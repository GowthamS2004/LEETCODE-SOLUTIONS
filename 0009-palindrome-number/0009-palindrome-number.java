class Solution {
    public boolean isPalindrome(int x)
     {
        if(x<0)
        {
            return false;
        }
        int y=x;
        int sum=0;
        while(y!=0)
        {
            int rem=y%10;
            sum=(sum*10)+rem;
            y/=10;
        }
        if(sum==x)
        {
            return true;
        }return false;
    }
}
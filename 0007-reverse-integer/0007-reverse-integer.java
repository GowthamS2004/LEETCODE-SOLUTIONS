class Solution {
    public int reverse(int x) 
    {
        int n=x;
        int sum=0;
        if(n<0)
        {
            n=n*-1;
        }
        while(n!=0)
        {
            int r=n%10;
            if(sum>(Integer.MAX_VALUE-r)/10)
            {
                return 0;
            }
            sum=(sum*10)+r;
            n=n/10;
        }
        if(x<0)
        {
             sum=sum*-1;
        }
        return sum;
    }
}
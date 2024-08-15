class Solution {
    public boolean lemonadeChange(int[] bills)
     {
        int n=bills.length;
        int fivecount=0;
        int tencount=0;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(bills[i]==5)
            {
                fivecount++;
            }
            else if(bills[i]==10)
            {
                if(fivecount>=1)
                {
                    fivecount--;
                    tencount++;
                }
                else
                {
                    return false;
                }
            }
            else if(bills[i]==20)
            {
                if(tencount>=1 && fivecount>=1)
                {
                    tencount--;
                    fivecount--;
                }
                else if(fivecount>=3)
                {
                    fivecount=fivecount-3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}
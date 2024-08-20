class Solution {
    public int findComplement(int num) {
       if(num==1 || num==2147483647){return 0;}
       int ind,pow=1;
        for( ind=0;ind<30;ind++)
        {
           if(pow==num)
           {
            break;
           }
           else if(pow>num)
           {
            ind--;
            break;
           }
           pow*=2;
        }
        for(int i=0;i<=ind;i++)
        {
            num=(num^(1<<i));
        }
        return num;
    }
}
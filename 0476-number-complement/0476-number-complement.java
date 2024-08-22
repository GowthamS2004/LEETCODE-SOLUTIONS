class Solution {
    public int findComplement(int num) {
       int temp=num;
       int t=0;
       while(temp!=0)
       {
        temp>>=1;
        t++;
       }
       int mask=(1<<t)-1;
       return num^mask;
    }
}

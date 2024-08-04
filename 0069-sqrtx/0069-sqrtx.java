class Solution {
    public int mySqrt(int x) {
      long str=0,end=x;
      while(str<=end){
        long mid=(str+end)/2;
        long q=mid*mid;
        if(q==x){
            return (int)mid;
        }else if(q>x){
            end=mid-1;
        }else{
            str=mid+1;
        }
      }return (int)end;
    }
}
import java.math.BigInteger;
class Solution {
    public String largestNumber(int[] nums) {
        String s[] = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i] = String.valueOf(nums[i]);
        }
       int n=nums.length;
        for(int k=0;k<n;k++)
        {
            String max=s[0];  
            for(int i=1;i<n-k;i++)
            {
                BigInteger a = new BigInteger(max + s[i]);
                BigInteger b = new BigInteger(s[i] + max);
                if(a.compareTo(b) < 0)
                {
                   max=s[i];
                }
                else
                {
                     String temp=s[i];
                    s[i]=max;
                    s[i-1]=temp;
                    
                }
            }
        }
            
       String ans="";
        for(int i=n-1;i>=0;i--){
            ans+=s[i];
        }
        return ans.charAt(0)=='0'?"0" : ans;
       // Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b)); 
       /**/
    }
}
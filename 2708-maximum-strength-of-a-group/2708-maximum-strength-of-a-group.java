class Solution {
    public long maxStrength(int[] nums) {

      Arrays.sort(nums);
        if(nums.length==1 || nums[0]==0 && nums[nums.length-1]==0)
        {
            return nums[0];
        }
      

        long pos=1;
        int pc=0;
        int neg=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                pos*=nums[i];pc++;
            }
            if(nums[i]<0)
            {
                neg++;
            }
        }
        long x=1;
        if(pc==0 && neg==1){return nums[nums.length-1];}
        if(neg%2==0)
        {
            for(int i=0;i<neg;i++)
            {
                 x*=nums[i];
            }
        }
        else
        {
            for(int i=0;i<neg-1;i++)
            {
                 x*=nums[i];
            }
        }
        return pos*x;
    }
}
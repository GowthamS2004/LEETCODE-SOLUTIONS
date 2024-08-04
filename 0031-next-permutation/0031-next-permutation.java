class Solution {
    public void nextPermutation(int[] nums) {
        
        int i,ind=-1,n=nums.length;
        for(i=n-1;i>=1;i--)
        {
            if(nums[i-1]<nums[i])
            {
                ind=i-1;break;
            }
        }
        if(ind!=-1)
        {
            for(i=n-1;i>=ind+1;i--)
            {
                if(nums[ind]<nums[i])
                {
                    int temp=nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=temp;
                    break;
                }
            }
        }
        int s=ind+1,e=n-1;
        while(s<=e)
        {
             int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;e--;
        }
    }
}
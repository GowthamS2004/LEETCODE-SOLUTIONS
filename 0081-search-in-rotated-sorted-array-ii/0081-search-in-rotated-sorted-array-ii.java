class Solution {
    public boolean search(int[] nums, int target)
    {
        int n=nums.length;
        for(int i=0;i<=n/2;i++)
        {
            if(nums[i]==target || nums[n-i-1]==target)
            {
                return true;
            }
        }
        return false;
    }
}
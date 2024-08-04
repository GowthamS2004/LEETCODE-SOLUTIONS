class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int st=0;
        int end=nums.length-1;
         int a1=-1;
        while(st<=end)
        {
             int mid=st+(end-st)/2;
             if(target==nums[mid])
             {
                a1=mid;
                end=mid-1;
             }
             else if(target>nums[mid])
             {
                st=mid+1;
             }
             else {
                end=mid-1;
             }
        }

          int a2=-1;
         st=0;
         end=nums.length-1;
         while(st<=end)
        {
             int mid=st+(end-st)/2;
             if(target==nums[mid])
             {
                a2=mid;
                st=mid+1;
             }
             else if(target>nums[mid])
             {
                st=mid+1;
             }
             else {
                end=mid-1;
             }
        }
       int[]ans={a1,a2};
       return ans;
    }
}
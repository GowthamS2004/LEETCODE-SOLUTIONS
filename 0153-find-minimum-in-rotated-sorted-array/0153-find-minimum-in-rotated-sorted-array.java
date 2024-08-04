class Solution {
    public int findMin(int[] nums) {
        int p=findPivot(nums);
        if(p==-1){return nums[0];}
        return nums[p+1];

    }
     public int findPivot(int[]nums)
        {
             int s=0;
        int e=nums.length-1;

             while(s<=e)
        {
            int mid=s+(e-s)/2;
            if( mid<e  && nums[mid]>nums[mid+1] ){return mid;}
            else if( mid>s && nums[mid]<nums[mid-1]){return mid-1;}
            else if(nums[s]>=nums[mid]){e=mid-1;}
            else {s=mid+1;}
        }
        return -1;
        }
}
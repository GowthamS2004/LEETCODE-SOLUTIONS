class Solution {
    public int search(int[] nums, int target) {
        
        int s=0;
        int e=nums.length-1;
       if(nums[0]==target){return 0;}
       if(nums[e]==target){return e;}
      int p=findPivot(nums); 

      if(p==-1)
      {
        return BS(nums,target,0,nums.length-1);

      }

       if(nums[p]==target){return p;} 
      
        if(target>nums[0])
       {
        return BS(nums,target,0,p-1);
       }
       else
       {
        return BS(nums,target,p+1,nums.length-1);
       }
    }


       

        //--------------------------------------------

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
    
    //-------- bs ---------------
    public int BS(int[]nums,int target,int s,int e)
    {
         while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(target<nums[mid])
            {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
     
    
}
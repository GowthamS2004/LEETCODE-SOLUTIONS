class Solution {
    public int[] findErrorNums(int[] nums)
     {
        int n=nums.length;
        int[]a=new int[2];
        int sum=((n)*(n+1))/2;int sum1=0;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!al.contains(nums[i]))
            {
                al.add(nums[i]);
            }
            else
            {
                a[0]=nums[i];
            }
            sum1=sum1+nums[i];
        }
        sum1=sum1-a[0];
         a[1]= sum-sum1;
        return a;
    }
}
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[]prefix=new int[n];
        int[]suffix=new int[n];

        prefix[0]=0;
        int max=height[0];
        for(int i=1;i<n;i++)
        {
            if(height[i]>max)
            {
                prefix[i]=height[i];
                max=height[i];
            }
            else
            {
                prefix[i]=max;
            }
            
        }
        
        suffix[n-1]=height[n-1];
         max=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
         
            if(height[i]>max)
            {
                suffix[i]=height[i];
                max=height[i];
            }
            else
            {
                suffix[i]=max;
            }   
        }

        int sum=0;
        for(int i=0;i<n;i++)
        {
            int x=Math.min(prefix[i],suffix[i]);
            if(x>height[i])
            {
                sum+=x-height[i];
            }
        }
        return sum;
    }
}
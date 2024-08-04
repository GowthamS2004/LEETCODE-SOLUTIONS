import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        /*if(m==0)
        {
            System.out.print(Arrays.toString(nums2));
        }
        else if(n==0)
        {
            System.out.print(Arrays.toString( nums1));
        }
      
      else{*/
      for(int i=0;i<n;i++)
      {
        if(m==0)
        {
            nums1[i]=nums2[i];
        }
        else
        {
        nums1[m+i]=nums2[i];
        }
      }
      Arrays.sort(nums1);
      System.out.print(Arrays.toString(nums1));
     // }

    }
}
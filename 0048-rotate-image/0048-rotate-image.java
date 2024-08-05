class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
      for(int i=0;i<=n-2;i++)
      {
        for(int j=i+1;j<=n-1;j++)
        {
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
      }  
      for(int i=0;i<n;i++)
      {
        reverse(matrix[i]);
      }
    }
    public void reverse(int[]matrix)
    {
        int s=0,e=matrix.length-1;
        while(s<e)
        {
             int temp=matrix[s];
            matrix[s]=matrix[e];
            matrix[e]=temp;
            s++;e--;
        }
    }
}
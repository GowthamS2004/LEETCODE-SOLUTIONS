class Solution {
    public boolean exist(char[][] board, String word) {
     int i,j,n,m;
     n=board.length;
     m=board[0].length;
     for(i=0;i<=n-1;i++)
     {
        for(j=0;j<=m-1;j++)
        {
            if(solve(board,word,n,m,i,j,0))
            {
                return true;
            }
        }
     }
     return false;
    }
    public boolean solve(char[][] board, String word,int n,int m,int row,int col,int i)
    {
        
        if(i==word.length())
        {
            return true;
        }
        if(row==-1 || col==-1 || row==n || col==m || board[row][col]!=word.charAt(i) || board[row][col]=='*')
        {
            return false;
        }
        else
        {
            char temp=board[row][col];
            board[row][col]='*';
            boolean res=solve(board,word,n,m,row-1,col,i+1)||solve(board,word,n,m,row,col+1,i+1)||solve(board,word,n,m,row+1,col,i+1)||solve(board,word,n,m,row,col-1,i+1);
            board[row][col]=temp;
            return res;
        }
    }
}
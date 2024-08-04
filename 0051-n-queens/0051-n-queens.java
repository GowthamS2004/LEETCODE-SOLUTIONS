class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        solve(result,board,0,n);
        return result;
    }
    public void solve( List<List<String>> result, char[][]board,int col,int n)
    {
        if(col==n)
        {
            List<String>list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                String str="";
                for(int j=0;j<n;j++)
                {
                    str=str+board[i][j];
                }
                list.add(str);
            }
            result.add(list);
            return;
        }
        else
        {
            for(int row=0;row<n;row++)
            {
                if(isSafe(row,col,board,n)==true)
                {
                    board[row][col]='Q';
                    solve(result,board,col+1,n);
                    board[row][col]='.';
                }
            }
        }
    }

    public boolean isSafe(int row,int col,char[][]board,int n)
    {
        int i,j;
        for(j=col-1;j>=0;j--)
        {
            if(board[row][j]=='Q')
            {
                return false;
            }
        }
        for(i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        for(i=row+1,j=col-1;i<n&&j>=0;i++,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
}
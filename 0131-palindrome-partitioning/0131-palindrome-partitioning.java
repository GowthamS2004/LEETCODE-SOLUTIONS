class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        List<String> list=new ArrayList<>();
        solve(s,result,list,0);
        return result;
    }
    public void solve(String s, List<List<String>> result,List<String> list,int start)
    {
        if(start==s.length())
        {
            result.add(new ArrayList<>(list));
            return;
        }
        else
        {
            for(int i=start;i<=s.length()-1;i++)
            {
                if(isPalindrome(s,start,i))
                {
                    list.add(s.substring(start,i+1));
                    solve(s,result,list,i+1);
                    list.remove(list.size()-1);
                }
            }
        }
    }
    public boolean isPalindrome(String str,int s,int e)
    {
         while(s<=e)
         {
            if(str.charAt(s)!=str.charAt(e))
            {
                return false;
            }
            s++;e--;
         }
         return true;
    }
   
}
class Solution {
    public String removeDuplicateLetters(String s) {
        
        int[]lastindex=new int[26];
        for( int i=0;i<s.length();i++)
        {
            lastindex[s.charAt(i)-'a']=i;
        }

        boolean[] seen =new boolean[26];
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(seen[c-'a']){continue;}
            while(!st.isEmpty() && st.peek()>c && i<lastindex[st.peek()-'a'])
            {
                seen[st.pop()-'a']=false;
            }
            st.push(c);
            seen[c-'a']=true;
        }
        String ans="";
        while(!st.isEmpty())
        {
            ans=st.pop()+ans;
        }
        return ans;
       
       
    }
}
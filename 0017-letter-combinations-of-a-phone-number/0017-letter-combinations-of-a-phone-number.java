class Solution {
    public List<String> letterCombinations(String digits) {
        
        HashMap<Character,String> dial=new HashMap<>();
        dial.put('2',"abc");
        dial.put('3',"def");
        dial.put('4',"ghi");
        dial.put('5',"jkl");
        dial.put('6',"mno");
        dial.put('7',"pqrs");
        dial.put('8',"tuv");
        dial.put('9',"wxyz");
      List<String> res =new ArrayList<>();
      if(digits.length()==0){return res;}
      String s="";

      solve(digits,res,dial,s,0);
      return res;

    }
    public void solve(String digits, List<String> res,HashMap<Character,String> dial,String s,int ind)
    {
        if(digits.length()==s.length())
        {
            res.add(s);
        }
        else{
            String pair=dial.get(digits.charAt(ind));
            for(int i=0;i<pair.length();i++)
            {
                solve(digits,res,dial,s+pair.charAt(i),ind+1);
            }
        }
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        return combinations(digits,"");
    }
    static ArrayList<String> combinations(String org,String p)
    {
        if(org.isEmpty())
        {
            ArrayList<String> list =new ArrayList<>();
            if(p.isEmpty()==false)
            {
            list.add(p);
            }
            return list;
        }
        int digits=org.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
        if(digits>6)
        {
            if(digits==7)
            {
           for(int i=((digits-1)*3);i<(digits*3)+1;i++)
        {
            char ch=(char) ('a'+i-3);
            ans.addAll(combinations(org.substring(1),p+ch));
        }
            }
            else if(digits==8)
            {
               for(int i=(((digits-1)*3)+1);i<=(digits*3);i++)
        {
            char ch=(char) ('a'+i-3);
            ans.addAll(combinations(org.substring(1),p+ch));
        } 
            }
            else
            {
               for(int i=(((digits-1)*3)+1);i<=(digits*3)+1;i++)
        {
            char ch=(char) ('a'+i-3);
            ans.addAll(combinations(org.substring(1),p+ch));
        } 
            }
        }
        else
        {
        for(int i=((digits-1)*3);i<(digits*3);i++)
        {
            char ch=(char) ('a'+i-3);
            ans.addAll(combinations(org.substring(1),p+ch));
        }
        }
        return ans;
    }
}

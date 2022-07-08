class Solution {
    public boolean isSubsequence(String s, String t) {
    
        return helper(s,t,0,0);
    }
    static boolean helper(String s1,String s2,int i,int j)
    {
        if(s1.length()==0)
    {
        return true;
    }
        if(i==s1.length())
        {
            return true;
        }
        if(j==s2.length())
        {
            return false;
        }
        if(s1.charAt(i)==s2.charAt(j))
        {
            return helper(s1,s2,i+1,j+1);
        }
        return helper(s1,s2,i,j+1);
        
    }
}

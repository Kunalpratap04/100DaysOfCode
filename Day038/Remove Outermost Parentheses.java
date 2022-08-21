class Solution {
        public String removeOuterParentheses(String s) {
            String ans="";
            Stack<Character> st=new Stack<>();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='(')
                {
                     if(st.isEmpty()==false)
                        ans=ans+"(";
                    st.push('(');
                   
                    
                }
                else
                {
                    st.pop();
                    if(st.isEmpty()==false)
                    {
                        ans+=")";
                    }
                }
            }
            return ans;
        }
}

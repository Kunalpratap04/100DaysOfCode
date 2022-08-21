class Solution {
    boolean isValid(String s)
 {
    Stack<Character> q=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                q.push('(');
            else if(s.charAt(i)=='{')
                q.push('{');
           else  if(s.charAt(i)=='[')
                q.push('[');
            else
            {
                if(q.isEmpty()==false)
                {
                    char x=q.peek();
                    if(x=='(') {
                        if ((int) s.charAt(i) == x + 1) {
                            q.pop();
                        } else
                            return false;
                    }
                    else if(x=='['|| x=='{')
                    {
                        if ((int) s.charAt(i) == x + 2) {
                            q.pop();
                        } else
                            return false;
                    }
                }
                else
                    return false;
            }

        }
        if(q.isEmpty())
        return true;
        else return false;
}
}

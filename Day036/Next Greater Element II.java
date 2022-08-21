class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int res[]=new int[n];
        for(int j=0;j<=1;j++)
        {
        for(int i=n-1;i>=0;i--)
        {
            while( st.isEmpty()==false && st.peek()<=nums[i] )
            {
                st.pop();
            }
            
            if(st.isEmpty()==false)
            {
                res[i]=st.peek();
            }
            else
                res[i]=-1;
            st.push(nums[i]);
        }
        }
        return res;
    }
}

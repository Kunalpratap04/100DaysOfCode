class Solution {
    int count=0;
   public  int findTargetSumWays(int[] nums, int target) {
       if(nums.length==0)
           return 0;
        help(nums,0,target,0);
        return count;
    }
    void help(int arr[],int i,int t,int sum)
    {
        if(i==arr.length)
        {
            if(t==sum)
            {
                count =count+1;
                return;

            }
            return ;
        }

        help(arr,i+1,t,sum+arr[i]);

        help(arr,i+1,t,sum-arr[i]);

    }
}

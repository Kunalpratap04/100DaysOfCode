class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        int n=0,k=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    
                    for( k=j+1;k<nums2.length;k++)
                    {
                        if(nums2[k]>nums2[j])
                        {
                            arr[n]=nums2[k];
                            n++;
                            break;
                        }
                    }
                    if(k==nums2.length)
                    {
                        arr[n]=-1;
                        n++;
                    }
                        
                    break;
                }
            }
        }
        return arr;
        
    }
}

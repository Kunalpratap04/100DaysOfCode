package code100days.Recursion;

public class MinimumInRotatedSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=0;
        
int arr[]= {5,6,7,8,1,2,3,4};
int end=arr.length-1;
System.out.println(findMin(arr,0,start,end));
	}
	static  int findMin(int[] arr,int min,int start,int end)
    {
        
        if(start>end)
        {
        	return min;
        }
        
      
            int mid=(start+end)/2;
        if(arr[mid]<=arr[arr.length-1])
        {
            min=arr[mid];
            return Math.min(min,findMin(arr, min,start,mid-1));
         
        }
        else
        {
        	 return findMin(arr, min,mid+1,end);
        }
        

    }
}

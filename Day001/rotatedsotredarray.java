package trial.BinarySearchques;

public class rotatedsotredarray {

	public static void main(String[] args) {
		int arr[]= {2,5,1};
    int t=1;
    System.out.println(search(arr,t));

	
	
	
	           }
	static int peak(int arr[])
			{
		        int start=0;
		        int end=arr.length-1;
		        int ans=0;
		        if(arr[0]>arr[1])
		        {
		        	return 0;
		        }
		        while(start<=end)
		        {
		        	int mid=(start+end)/2;
		        	
		        	if(mid<end && arr[mid]<arr[mid+1] )
		        	{
		        		start=mid+1;
		        	}
		        	
		        	else 
		        	{
		        		ans=mid;
		        		end=mid-1;
		        	}
		        }
		        return ans;
			}
	static int search(int arr[],int t)
	{
		
		
		int peak=peak(arr);
		System.out.println("peak="+peak);
		int end=peak;
		int start=0;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]<t)
			{
				start=mid+1;
			}
			else if(arr[mid]>t)
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
		}
		start=peak+1;
		end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			System.out.println("mid="+mid);
			if(arr[mid]<t)
			{
				start=mid+1;
			}
			else if(arr[mid]>t)
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

}
package code100days.Recursion;

public class demo {

	public static void main(String[] args) {
			int n=4;
			int arr[]= {1,2,3,4,6,7};
			 int start=0;
			int  end=arr.length-1;
			System.out.println(print(n,arr,start,end));
}
	static int print(int n,int arr[],int start,int end)
	{
		
		 if(start>end)
		 {
			 return -1;
		 }
		
			int mid=(start+end)/2;
			 if(arr[mid]<n)
			{
				return  print( n, arr,mid+1,end);
			}
			 if(arr[mid]>n)
			{
				 return print( n, arr,start,mid-1);
			}
			
				return mid;
	}

}

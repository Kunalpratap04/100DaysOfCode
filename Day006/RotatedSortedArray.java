package code100days.Recursion;

public class RotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //int arr[]= {7,8,9,10,1,3,5,6};
  int arr[]= {3,1,2};
  int t=6;
  int start=0;
  int end=arr.length-1;
  System.out.println(search(arr, t, start, end));
	}
 static int search(int arr[],int t,int start,int end)
 {
	 int mid=(start+end)/2;
	 

	 
	 if(start>end)
	 {
		 return -1;
		 
	 }
	 
	 if(arr[mid]==t)
	 {
		 return mid;
	 }
	 if(arr[mid]<=arr[end])
	 {
		 if(t>=arr[mid]&& t<=arr[end])
		 {
			 return search(arr,t,mid+1,end);
		 }
		 else
			return search(arr,t,start,mid-1);
	 }
	 
	 
		 if(t>=arr[start]&& t<=arr[mid])
		 {
			 		 return search(arr,t,start,mid-1);
		 }
		 
		 return search(arr,t,mid+1,end);
	 
	
 

 }
}

package trial.BinarySearchques;

import java.util.Arrays;

public class Firstandlastelement {
	// find the starting position and ending position of a given target value in given ascending 
	//sorted array if not found print -1,-1.

	public static void main(String[] args) {
		
		int arr[]= {1,2,2,3,4,5,6,6,6,7,7,8};
		int t=9;
		int arr1[]=range(arr,t);
		System.out.println(Arrays.toString(arr1));

	}
	static int[] range(int arr[],int t)
	{
		int start=0;
		   int end =arr.length-1;
		   int l=-1;
		   int f=-1;
		   int mid=0;
		  int res[]= {-1,-1};
		  
		   while(start<=end)
		   {
			    mid=start+(end-start)/2;
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
				   if(mid==arr.length-1 || arr[mid+1]>t)
				   {
					   l=mid;
					   end=mid;
					   break;
				   }
				   else 
				   {
					   start=mid+1;
				   }
			   }
		   }
		   start=0;
		   if(l==-1)
		   {
			   res[0]=f;
			   res[1]=l; 
			 return res;  
		   }
		   else
		   {
		   while(start<=end)
		   {
			   mid=start+(end-start)/2;
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
			   if(mid==0 || arr[mid-1]<t)
			   {
				   f=mid;
				   break;
			   }
			   else
			   {
				   end=mid-1;
			   }
			   }
		   }
		   res[0]=f;
		   res[1]=l;
		   return res;
		   }
	   }

}

package trial.BinarySearchques;

public class kthmissingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr[]= {3,4,6,7,9};
		int k=4;
		System.out.println(findMising(arr, k));

	}
	static int findMising(int arr[],int k)
	{   
		  int start=0;
	      int exp=arr[0]+(arr.length-1);
	      int end= arr.length-1;
	      int count=0;
	      if(arr[end]==end+1)
	      {
	    	  return arr[end]+k;
	      }
		      while(start<=end)
		      {
		    	  
		    	  int mid=(start+end)/2;
		    	  System.out.println("mid="+mid);
		    	  exp=mid+1;
		    	   count=arr[mid]-exp;
		    	   System.out.println("count="+count);
		    		 if(count<k)
		    		 {
		    			 start=mid+1;
		    			 System.out.println("start="+start);
		    		 }
		    		 else if(count>=k)
		    		 {
		    			end=mid-1; 
		    			 System.out.println("end="+end);
		    		 }
		    		
		    			 
		    		 }
		      if(end==-1)
		      {
		    	  return k;
		      }
		      int a=arr[end]-(end+1);
		      return (arr[end]+k-a);
		      
		
		
		
		
		
		

	}

}

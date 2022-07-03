package code100days.Recursion;

public class KokoEatingBananas {

	public static void main(String[] args) {
		int arr[]= {3,7,11,6};
		int h=8;
		System.out.println(minEatingSpeed(arr, h));
		

	}
	
	    static int minEatingSpeed(int[] arr, int h) {
	        int max=Integer.MIN_VALUE;
	        int parts=0;
	        for(int i=0;i<arr.length;i++)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}
			}
	        int x=1;
	     while(x<max)
	{
		int mid=x+(max-x)/2;
		parts=0;
		for(int j=0;j<arr.length;j++)
		{
			if((arr[j]%mid)==0)
			{
			parts=parts+(arr[j]/mid);
			}
			else
			{
			 parts=parts+(arr[j]/mid)+1;
			}
		}
		if(parts<=h)
		{
			max=mid;
		}
		else
		{
			x=mid+1;
		}
	}

			return max;        
	    
	    }
	}




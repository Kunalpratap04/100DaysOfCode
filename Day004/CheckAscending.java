package code100days.Recursion;

public class CheckAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,3,4,5};
     System.out.println(check(arr));
	}
	static boolean check(int arr[])
	{
		if(fun(arr,0)!=arr.length-1)
		{
			return false;
		}
		return true;
	}
  static int fun(int arr[],int pos)
  {
	  if(pos==arr.length-1)
	  {
		  return pos;
	  }
	  if(arr[pos]<arr[pos+1])
	  {
		  return fun(arr,pos+1);
	  }
	  return pos;
  }
}

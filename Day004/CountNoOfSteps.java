package code100days.Recursion;

public class CountNoOfSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =14;
		System.out.println(numberOfSteps(num));

	}
	  static int numberOfSteps(int num) {
	       return fun(num,0); 
	    }
	  private  static int fun(int num,int count)
	    {
	        if(num==0)
	        {
	            return count;
	        }
	        if((num&1)==0)
	        {
	            return fun(num/2,count+1);
	        }
	        return fun(num-1,count+1);
	    }
}

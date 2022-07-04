package code100days.Recursion;

public class CountZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=3000405;
  System.out.println(count(n));
	}
     static int helper(int n,int count)
     {
    	 if(n==0)
    	 {
    		 return count;
    	 }
    	 if(n%10==0)
    	 {
    		 return helper(n/10,count+1);
    	 }
    	 return helper(n/10,count);
     }
     static int count(int n)
     {
    	 return helper(n,0);
     }
}

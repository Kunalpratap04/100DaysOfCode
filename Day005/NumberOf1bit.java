package code100days.Recursion;

public class NumberOf1bit {

	public static void main(String[] args) {
		
         System.out.println(count(343,0));
         
	}
    static int count(int n,int c)
    {
   	
	 if(n==0)
	 {
		 return c;
	 }
	 return count((n&(n-1)),c+1);
    }
}

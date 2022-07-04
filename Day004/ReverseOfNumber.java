package code100days.Recursion;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(pallindrome(121));
	}
  static int reverse(int n)
  {
	  if(n==0)
	  {
		  return n;
	  }
	  
	  System.out.print(n%10);
	  return reverse(n/10);
  }
  
  static int rev(int n) // 2nd approach without using print
  {
	  int digits=(int)(Math.log10(n))+1;
	 if(n/10==0)
	 {
		 return n;
	 }
	  int rem=n%10;
	  return ((rem*(int)Math.pow(10, digits-1)) +rev(n/10));
	  
  }
  static boolean pallindrome(int n)
  {
	  return n==rev(n);
  }
}

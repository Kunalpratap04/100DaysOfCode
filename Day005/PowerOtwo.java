package code100days.Recursion;

public class PowerOtwo {

	public static void main(String[] args) {
		
     System.out.println(isPowerOfTwo(64));
	}
	
	    static boolean isPowerOfTwo(int n) {
	      
	        if(n==1)
	        {
	            return true;
	        }
	         if((n&1)!=0 || n==0)
	       {
	           return false;
	       }
	        return isPowerOfTwo(n/2);
	    }
	    
	}


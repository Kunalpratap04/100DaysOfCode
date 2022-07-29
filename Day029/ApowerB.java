package Mathsfordsa;

public class ApowerB {
	//Find value of a raised to power of B

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(4,4));

	}
 static int power(int a,int b)
 {
	 int ans=1;
	int base=a;
	 while (b>0)
	 {
		 if((b&1)!=0)
		 {
			 ans=ans*base;
		 }
		 base=base*base;
		b= b>>1;
	 }
	 return ans;
 }
}

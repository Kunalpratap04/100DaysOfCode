package Mathsfordsa;

public class nthMagicNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		System.out.println(magic(k));

	}
	static int magic(int n)
	{
		int m=(int)((Math.log(n)/Math.log(2))+1);
		System.out.println(m);
		int sum=0;
		for(int i=1;i<=m;i++)
		{
			sum+=((n&(1<<i-1))>>i-1)*Math.pow(5,i);
			System.out.println("sum="+sum);
		}
		
		return sum;
	}

}

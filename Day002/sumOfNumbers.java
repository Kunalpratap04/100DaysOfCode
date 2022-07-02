package code100days.Recursion;

public class sumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1342));

	}
	static int sum(int n)
	{
		if(n/10==0)
		{
			return n;
		}
		int num=n%10;
		return (num * sum(n/10)); fghfghfghfghfghfh
		
	}

}

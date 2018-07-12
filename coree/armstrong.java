package coree;

public class armstrong {
	public static void main(String args[])
	{
		int n=154,r,temp=n,sum=0;
		while(n>0)
		{
			r=n%10;
			sum = (sum)+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("no is armstrong");
		}
		else
			System.out.println("no is not armstrong");
		
		
	}

}

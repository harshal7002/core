package coree;

public class Palindrome {
	public static void main(String args[])
	{
		int n=157,r,temp=n,sum=0;
		while(n>0)
		{
			r=n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("no is palindrome");
		}
		else
			System.out.println("no is not palindrome");
		
		
	}
}

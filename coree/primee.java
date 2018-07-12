package coree;

import java.util.Scanner;

public class primee {
	public static void cprime(int n)
	{
		int i=0;
		int m=n/2;
		boolean flag=false;
		if(n==0)
		{
			System.out.println(n+" not prime");
		}
		else if(n==1) {
			System.out.println(n+" not prime");
		}
		else
		{
			for(i=2;i<=m;i++) 
			{
				if(n%i==0)
				{
					System.out.println(n+" not prime");
					flag=true;
					break;
					
				}
			}
			if(flag==false)
			{
				System.out.println(n+" prime" );
			}
		
		}

	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no:");
		int n= sc.nextInt();
		cprime(n);
	}
}

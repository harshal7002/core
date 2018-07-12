package coree;

import java.util.Scanner;

public class Prime__n {
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n1 = s1.nextInt();
		Scanner s2=new Scanner(System.in);
		int n2 = s2.nextInt();
		for(int i=n1 ; i<=n2 ;i++)
		{
			 if (isPrime(i)) {  
	               System.out.println(i);  
	           }  
		}
	}
	public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
}

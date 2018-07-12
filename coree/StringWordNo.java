package coree;

import java.util.Scanner;
class stw{
	public void stword(String s)
	{
		int i,cout=0;
		if(s.charAt (0)!=' ')
		{
			cout++;
		}
		for(i=0;i<s.length()-1;i++)
		{ 
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				cout++;
			}
		}
		System.out.println("no of words:"+cout);
	}
}
public class StringWordNo {
	
	public static void main(String[] args)
	{
		stw s1=new stw();
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		String st= sc.nextLine();
		System.out.println(st);
		s1.stword(st);
		sc.close();

	}
}

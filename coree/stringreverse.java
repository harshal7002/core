package coree;

public class stringreverse {
	public static void main(String args[])
	{
		String s="hrllo";
		String rev="";
		int len=s.length();
		int i=0;
		for(i=len-1;i>= 0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse="+rev);
	}
}

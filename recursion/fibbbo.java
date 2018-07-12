package recursion;
public class fibbbo {
	static int n1=0,n2=1,n3=0;
	public static void fibbo(int n) {
		if(n>0)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			fibbo(n-1);
		}
		
	}
	
	public static void main(String args[])
	{
		int count=10;
		fibbo(count-2);
//		int n1=0,n2=1,n3,count=10;
//		int i;
//		System.out.println(n1+" \n"+n2);
//		for(i=2;i<count;i++)
//		{
//			n3=n1+n2;
//			System.out.println(n3);
//			n1=n2;
//			n2=n3;
	}
}


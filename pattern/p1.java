package pattern;

public class p1 {
	public static void main(String args[])
	{	
		int i=0,j;
		System.out.println("------------------------------------");
		System.out.println("pattern :");
		System.out.println("------------------------------------");
		
		
		for(i=9;i>=0;i--)
		{
			for(j=0;j<=9;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		System.out.println("pattern :");
		System.out.println("------------------------------------");
		
		for(i=0;i<=9;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		System.out.println("pattern :");
		System.out.println("------------------------------------");

		for(i=0;i<=9;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=9;j++) 
			{	
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println("------------------------------------");
		System.out.println("pattern :");
		System.out.println("------------------------------------");
		int num=0;
		for(i=9;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<9;j++) 
			{	
				System.out.print(num);
			}
			num=num+1;
			System.out.println("");
		}
	}
}

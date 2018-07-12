package recursion;
class factorial{
	static int facto(int n) {
		if(n==1)
			return 1;
		else
			return (n*(facto(n-1)));
		
	}	
}
public class fact {
	public static void main(String arg[])
	{
		System.out.println(factorial.facto(5));
	}
}

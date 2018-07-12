package coree;
class sumfl{
	static int fn( int a) {
		while (a>=10)
		{
			a/=10;
		}
		return a;
	}
	static int ln(int a) {
		a=a%10;
		return a;
	}
}
public class sum_first_last {
	public static void main(String[] args)
	{
		int n= 13849;
		int sum=sumfl.fn(n)+sumfl.ln(n);
		System.out.println(sum);
	}
	
}

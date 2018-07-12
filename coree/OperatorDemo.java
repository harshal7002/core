package coree;

public class OperatorDemo {
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		int c=0;
		c=a++ + ++b;
		System.out.println(c);
		c=++a + ++b;
		System.out.println(c);
		c= ++a + b++;
		System.out.println(c);
		a=5;
		c=a<<3;
		System.out.println(c);
		c=20>>2;
		System.out.println(c);
		c=20>>>2;
		System.out.println(c);
	}
}
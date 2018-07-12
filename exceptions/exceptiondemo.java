/**
 * @author Harshal
 *demo of throw and throws
 *throw are use to send use to send explicit exception. used inside method
 *throws are use to declare exception that needs to be handled. used with method
**/

package exceptions;
class demo extends Exception{

	void display() {
		try {
			throw new Exception("demo exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class te{
	void div(int a,int b) throws ArithmeticException{
		int c=a/b;
	}
}
public class exceptiondemo {
	public static void main(String[] args)
	{
		demo d1=new demo();
		d1.display();
		te t1=new te();
		try
		{
			t1.div(10, 0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}

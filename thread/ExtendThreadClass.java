package thread;

public class ExtendThreadClass extends Thread {
	public void run()
	{
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		ExtendThreadClass t1=new ExtendThreadClass();
		t1.start();
		}
	
}

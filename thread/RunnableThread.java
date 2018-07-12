package thread;
class runThread implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(100);
				System.out.println("no :"+i);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class RunnableThread {
	public static void main(String[] args)
	{
		runThread r1=new runThread();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r1);		
		System.out.println(t1.getName());
		t1.setName("hello");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();

	}
}

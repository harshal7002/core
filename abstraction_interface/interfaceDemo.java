package abstraction_interface;
interface whatspp{
	void send();
	void receive();
	void call();
}
class app implements whatspp
{
	public void send() {
			System.out.println("sending message.......");
	}

	public void receive() {
			System.out.println("receiving message......");
	}

	public void call() {
			System.out.println("calling...........");
	}
}

public class interfaceDemo {
	public static void main(String[] args) {
		app chatapp=new app();
		chatapp.send();
		chatapp.receive();
		chatapp.call();
		
	}
}

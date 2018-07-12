package abstraction_interface;
abstract class whatsapp{
	int a;
	abstract void chat();
	void delete() {
		System.out.println("deleted account");
	}
	
}
class send extends whatsapp{
	void chat() {
		System.out.println("sender: hi abstraction");
	}
}
class reply extends whatsapp
{
	void chat() {
		System.out.println("reply to sender: hello");
	}
}
public class abstractionDemo {
	public static void main(String[] args)
	{
		whatsapp talk;
		talk=new send();
		talk.chat();
		talk=new reply();
		talk.chat();
		talk.delete();
	}
}

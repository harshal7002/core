package encapsulation;
public class enterData {
	public static void main(String args[])
	{
		Datahiding d1=new Datahiding();
		d1.setId(1);
		d1.setName("Harshal");
		d1.setCity("Ahmedabad");
		d1.setDept("Computer");
		System.out.println(d1.getCity());
	}
}

/**
 * @author Harshal
 * used to clone object
 */

package coree;
class Student implements Cloneable {
	int no;
	String name;
	public void display(int no, String name)
	{
		this.no=no;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class clonedata  {
	public static void main(String[] args)
	{
		try {
			Student s1=new Student();
			s1.display(1,"wqe");
			System.out.println(s1.no+""+s1.name);
			Student s2=new Student();
			s2=(Student)s1.clone();
			System.out.println(s2.no+""+s2.name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}

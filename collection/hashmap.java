package collection;

import java.util.HashMap;
import java.util.Map;
class Student{
	String name,lname,add;
	int no;
	Student(int no,String name,String lname,String add)
	{
		this.no=no;
		this.name=name;
		this.lname=lname;
		this.add=add;
	}
}
public class hashmap {
	public static void main(String[] args)
	{
		HashMap<Integer, Student> student=new HashMap<Integer,Student>();
		Student s1=new Student(1,"harshal","Patil","snagar");
		student.put(1,s1);
		System.out.println(student.containsKey(1));
		System.out.println(student.hashCode());
		System.out.println(student.size());
		for(Map.Entry<Integer,Student> m:student.entrySet())
		{
			Student s=m.getValue();
			System.out.println(m.getKey()+" "+s.name+" "+s.lname+" "+s.add);
		} 
	}
}
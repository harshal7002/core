package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class duplicateNo {
	public static void main(String[] args)
	{
		List<Integer> li=new ArrayList<>();
		int temp=0,count=0;
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(40);
		li.add(30);
		System.out.println(li);
		int size= li.size();
		try 
		{
			for(int i=0;i<size;i++)
			{
				temp=li.get(i);
				for(int j=i+1;j<size;j++)
				{
					if(temp==li.get(j))
					{
						System.out.println("duplicate :"+ temp);
						count++;
					}
				}
			 }
			System.out.println("total no of duplicate:"+count);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("list1");
		System.out.println(li);
		Comparator<Integer> c=Collections.reverseOrder();
		Collections.sort(li,c);
		System.out.println("reverse natural order");
		System.out.println(li);

	}
}

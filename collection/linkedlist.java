package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args)
	{
		LinkedList<String> s=new LinkedList<>();
		s.add("no 1 ");
		s.add("no 2");
		s.addFirst("no start");
		s.addLast("no end");
		for(String ob:s)
		{
			System.out.println(ob);
		}
		System.out.println(s.getFirst());
		Iterator<String> it=s.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

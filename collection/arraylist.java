package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,8};
		for(int obj:a)
		{
			System.out.println(obj);
		}
		System.out.println("array length :"+a.length);
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(10);
		a1.add(12);
		a1.add(11);
		a1.size();
		Iterator<Integer> itr=a1.iterator();
		System.out.println("arraylist length :"+a1.size());
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		for(int oj:a1)
//		{
//			System.out.println(oj);
//		}
		System.out.println("using get :" +a1.get(2));
		
//		arraylist user
		
		ArrayList<Integer> a2=new ArrayList<>();
		System.out.println("enter the no of data u want to enter :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a2.add(sc.nextInt());
		}
		System.out.println(a2.size());
		Iterator<Integer> it=a2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		sc.close();
	}
}

package collection;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Queue<Integer> q = new LinkedList<>();	
	    q.add(12);
	    q.add(15);
	    q.add(16);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
	}

}

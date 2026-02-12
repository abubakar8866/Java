package collections.linkedlists;

import java.util.Iterator;
import java.util.LinkedList;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			Write a program to implement FIFO behavior using LinkedList as a Queue.

			Write a program to add and remove elements from a LinkedList Queue.
			
			Write a program to allow and demonstrate storing null values in a LinkedList Queue.
			
			Write a program to traverse a LinkedList Queue using:
			
			for-each loop
			
			Iterator
			
			Write a program to simulate a customer service queue using LinkedList.
			
			Write a program to reverse a Queue implemented using LinkedList.
			
			Write a program to find the front and rear elements of a LinkedList Queue.
		*/
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(null);
		
		ll.add(1);
		
		ll.add(2);
		
		ll.addFirst(0);
		
		ll.addLast(99);
		
		for(Integer i : ll) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		Iterator<Integer> it = ll.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		System.out.println("Front ele:"+ll.getFirst());
		System.out.println("Rear ele:"+ll.getLast());
	}

}

package collections.arrayBlockingQueues;

import java.util.concurrent.ArrayBlockingQueue;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to compare add() vs offer() behavior in bounded queues.
		 * 
		 * Write a program to demonstrate remove() vs poll() behavior.
		 * 
		 * Write a program to demonstrate peek() vs element() behavior.
		 */

		ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<Integer>(3);

		//arrayBlockingQueue.add(1);
		//arrayBlockingQueue.add(2);
		//arrayBlockingQueue.add(3);

		// IllegalStateException
		// System.out.println(arrayBlockingQueue.add(41));
		
		//false
		//System.out.println(arrayBlockingQueue.offer(6));
		
		//System.out.println(arrayBlockingQueue.remove());
		//arrayBlockingQueue.remove();
		//System.out.println(arrayBlockingQueue.poll());
		
		//NoSuchElementException
		//arrayBlockingQueue.remove();
		
		//null
		//System.out.println(arrayBlockingQueue.poll());

		//null
		//System.out.println(arrayBlockingQueue.peek());
		
		//NoSuchElementException
		//System.out.println(arrayBlockingQueue.element());
		
	}

}

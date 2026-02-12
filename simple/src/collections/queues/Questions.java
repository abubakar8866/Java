package collections.queues;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			Write a program to store integer elements in a Queue and display them.

			Write a program to insert elements into a Queue using add() and offer().

			Write a program to remove elements from a Queue using remove() and poll().

			Write a program to retrieve the head element using peek() and element().

			Write a program to check whether a Queue is empty or not.

			Write a program to find the size of a Queue.
			
			Write a program to simulate a printer job queue.

			Write a program to handle customer orders using Queue.
			
			Write a program to remove duplicate elements from a Queue.

			Write a program to read user input and process data in FIFO order.
		 */
		
		
		/*
		 * Queue<Integer> queues = new ArrayDeque<Integer>();
		 * 
		 * System.out.println(queues.add(1));
		 * 
		 * queues.offer(2);
		 * 
		 * queues.add(3);
		 * 
		 * queues.add(4);
		 * 
		 * System.out.println(queues);
		 * 
		 * System.out.println(queues.poll());
		 * 
		 * System.out.println(queues);
		 * 
		 * System.out.println(queues.remove());
		 * 
		 * System.out.println(queues);
		 * 
		 * System.out.println(queues.peek());
		 * 
		 * System.out.println(queues.element());
		 * 
		 * System.out.println(queues.isEmpty());
		 * 
		 * System.out.println(queues.size());
		 */
		 
		/*Queue<String> printerQueue = new LinkedList<>();
		
		printerQueue.add("resume.pdf");
		printerQueue.add("myPic.png");
		printerQueue.add("document.docx");
		
		while(!printerQueue.isEmpty()) {
			System.out.println(printerQueue.poll());
		}*/
		
		Queue<Integer> queue = new LinkedList<Integer>(List.of(1,2,2,3,3,4,5,5));
		
		HashSet<Integer> seen = new HashSet<Integer>();
		Queue<Integer> result = new LinkedList<Integer>();
		
		for(int n : queue) {
			if(seen.add(n)) {
				result.add(n);
			}
		}
		
		System.out.println(result);
		
	}

}

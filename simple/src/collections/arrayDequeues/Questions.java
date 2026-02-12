package collections.arrayDequeues;

import java.util.ArrayDeque;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			Write a program to store elements using ArrayDeque.

			Write a program to insert elements at both ends of a Deque using:
			
			addFirst()
			
			addLast()
			
			Write a program to remove elements from both ends of a Deque.
			
			Write a program to demonstrate that ArrayDeque does not allow null values.
			
			Write a program to use ArrayDeque as:
			
			Stack (LIFO)
			
			Queue (FIFO)
			
			Write a program to reverse a Queue using ArrayDeque.
			
			CPU Task Scheduling using Deque
			
			Undo / Redo using Deque
		*/
		
		/*ArrayDeque<Integer> arrDqueue = new ArrayDeque<Integer>();		
		
		arrDqueue.addLast(2);
		arrDqueue.addFirst(1);
		arrDqueue.add(3);
		arrDqueue.add(4);
		
		System.out.println(arrDqueue);
		
		System.out.println(arrDqueue.removeFirst());
		
		System.out.println(arrDqueue);
		
		System.out.println(arrDqueue.removeLast());
		
		System.out.println(arrDqueue);
		
		arrDqueue.add(null);*/
		
		/*
		 * ArrayDeque<String> cpuTaskSchedulling = new ArrayDeque<String>();
		 * cpuTaskSchedulling.add("first task");
		 * cpuTaskSchedulling.addLast("second task");
		 * cpuTaskSchedulling.addFirst("Emergency task");
		 * 
		 * while (!cpuTaskSchedulling.isEmpty()) {
		 * System.out.println(cpuTaskSchedulling.poll()); }
		 */
		
		ArrayDeque<String> undo = new ArrayDeque<>();
		ArrayDeque<String> redo = new ArrayDeque<>();
		
		undo.add("Task A");
		undo.add("Task B");
		undo.add("Task C");
		
		String undoAction = undo.pop();
		redo.push(undoAction);
		System.out.println("Undo = "+undoAction);
		
		String redoAction = redo.pop();
		undo.push(redoAction);
		System.out.println("Redo = "+redoAction);
		
	}

}

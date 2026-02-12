package collections.queues;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// allowed null linkedList
		// Queue<Integer> queue = new LinkedList<Integer>();

		// null - noexception
		// queue.offer(null);

		ArrayDeque<Integer> dqQueue = new ArrayDeque<Integer>();
//		ArrayDeque<Integer> arrdqQueue = new ArrayDeque<Integer>();
		// null - exception
		// Boolean b = dqQueue.add(null);
		// System.out.println(b);

		/*
		 * Boolean b = dqQueue.offer(null); System.out.println(b);
		 */
		// System.out.println(dqQueue.peek());

//		Queue<String> q = new ArrayDeque<>();
//		
//		//q.add(null);
//		Boolean b=  q.offer(null);

		dqQueue.offer(1);
		dqQueue.offerFirst(89);
		dqQueue.peekLast();

		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.offer(100);
		System.out.println(p);
		p.offer(3);
		System.out.println(p);
		p.offer(9);
		System.out.println(p);
		p.offer(13);
		System.out.println(p);

		Queue<Integer> q = new ArrayBlockingQueue<Integer>(3);
		q.add(2);
		q.add(3);
		q.add(3);
		System.out.println(q.add(8));
		System.out.println(q);

	}

}

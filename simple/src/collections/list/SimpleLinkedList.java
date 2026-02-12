package collections.list;

import java.util.LinkedList;
import java.util.List;

public class SimpleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can add and delete from anywhere quickly.
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.addLast(78);
		linkedList.add(89);
		linkedList.addFirst(5);
		System.out.println(linkedList);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		linkedList.removeFirst();
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
	}

}

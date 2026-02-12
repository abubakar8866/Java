package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 java.lang.Iterable
        │
        ▼
		java.util.Collection   (Interface)
        │
        ├── List (Interface)
        │     ├── ArrayList
        │     ├── LinkedList
        │     └── Vector
        │           └── Stack
        │
        ├── Set (Interface)
        │     ├── HashSet
        │     │     └── LinkedHashSet
        │     ├── SortedSet
        │     │     └── NavigableSet
        │     │           └── TreeSet
        │
        └── Queue (Interface)
              ├── PriorityQueue
              └── Deque
                    ├── ArrayDeque
                    └── LinkedList
		 */
		
		/*
		java.util.Map   (Interface)
        │
        ├── HashMap
        │     └── LinkedHashMap
        │
        ├── SortedMap
        │     └── NavigableMap
        │           └── TreeMap
        │
        ├── Hashtable
        │
        └── ConcurrentHashMap
		 */
		
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> li1 = new ArrayList<Integer>();
		List<String> li2 = new ArrayList<String>();
		li1.add(90);
		li.add(1);
		li.addAll(li1);
		li.add(2);
		li.add(0, 45);
		li.add(3, 56);
		System.out.println(li);
		li.set(0, 1);
		System.out.println(li);
		li.remove(0);
		System.out.println(li);
		System.out.println(li.get(-00));
		li2.add("abu");
		li2.add("bakar");
		System.out.println(li2);
		li2.remove("bakar");
		System.out.println(li2);
		System.out.println(li);
		
		Iterator<Integer> it = li.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		ListIterator<Integer> itt = li.listIterator(li.size());
		while(itt.hasPrevious()) {
			System.out.print(itt.previous()+" ");
		}
		System.out.println();
		
		System.out.println(li.subList(-0, 3));
		
	}

}

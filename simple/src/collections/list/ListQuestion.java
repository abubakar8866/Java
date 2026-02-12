package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

import collections.set.Product;

public class ListQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to store employee names in an ArrayList and print them.
		 * 
		 * Write a program to insert elements at a specific index in a List.
		 * 
		 * Write a program to remove:
		 * 
		 * element by index
		 * 
		 * element by value from a List.
		 * 
		 * Write a program to iterate a List using:
		 * 
		 * for loop
		 * 
		 * for-each
		 * 
		 * iterator
		 * 
		 * Write a program to sort a List of integers in ascending order.
		 * 
		 * Write a program to sort a List of strings in descending order.
		 * 
		 * Write a program to find duplicate elements in a List.
		 * 
		 * Write a program to remove duplicates from a List without using Set.
		 * 
		 * Write a program to reverse a List.
		 * 
		 * Write a program to find maximum and minimum element in a List.
		 * 
		 * Write a program to merge two Lists into one.
		 * 
		 * Write a program to convert a List into an array.
		 * 
		 * Write a program to count frequency of each element in a List.
		 * 
		 * Write a program to traverse a List using ListIterator in both directions.
		 * 
		 * Write a program to make a List thread-safe.
		 * 
		 * Write a program to handle NullPointerException in collections safely.
		 * 
		 * Write a program to demonstrate ArrayList vs LinkedList performance.
		 */

		// Write a program to store employee names in an ArrayList and print them.
		// ArrayList<String> arrayList = new ArrayList<String>();

		// arrayList.add("bakar");

		// Write a program to insert elements at a specific index in a List.
		// arrayList.add(0, "Abu");

		// arrayList.add("amin");

		// arrayList.add("khan");

		// System.out.println(arrayList);

		// Write a program to remove:
		// element by index
		// arrayList.remove(2);

		// element by value from a List.
		// arrayList.remove("khan");

		// Write a program to iterate a List using:
		// for loop
		/*
		 * for (int i = 0; i < arrayList.size(); i++) {
		 * System.out.print(arrayList.get(i)+" "); } System.out.println();
		 */

		// for-each
		/*
		 * for(String arr: arrayList) { System.out.print(arr+" "); }
		 * System.out.println();
		 */

		// iterator
		/*
		 * Iterator<String> it = arrayList.iterator(); while(it.hasNext()) {
		 * System.out.print(it.next()+" "); } System.out.println();
		 */

		// Write a program to sort a List of integers in ascending order.
		/*
		 * List<Integer> li = new ArrayList<Integer>(); li.add(329); li.add(300);
		 * li.add(89);
		 * 
		 * Collections.sort(li,(a,b)->a-b); System.out.println(li);
		 */

		// Write a program to sort a List of strings in descending order.
		// Collections.sort(li,(a,b)->b-a);
		// System.out.println(li);

		// Write a program to find duplicate elements in a List.
		// Write a program to remove duplicates from a List without using Set.
		/*
		 * List<Integer> li = new ArrayList<Integer>(); li.add(10); li.add(20);
		 * li.add(30); li.add(40); li.add(50); li.add(20); boolean isDuplicate = false;
		 * for (int i = 0; i < li.size(); i++) { for (int j = i+1; j < li.size(); j++) {
		 * if(li.get(i) == li.get(j)) { isDuplicate = true; li.remove(j); } } }
		 * System.out.println(isDuplicate); System.out.println(li);
		 */

		// Write a program to reverse a List.
		/*
		 * List<Integer> li = new ArrayList<Integer>(); li.add(10); li.add(20);
		 * li.add(30); li.add(30); li.add(40); li.add(10);
		 */

		// Collections.sort(li.reversed());
		// System.out.println(li);

		// Write a program to find maximum and minimum element in a List.
		/*
		 * int max = Integer.MIN_VALUE; int min = Integer.MAX_VALUE; for (int i = 0; i <
		 * li.size(); i++) { if(min > li.get(i)) { min = li.get(i); } if(max <
		 * li.get(i)) { max = li.get(i); } } System.out.println("Minimum = "+min);
		 * System.out.println("Maximum = "+max);
		 */

		// Write a program to merge two Lists into one.
		/*
		 * List<Integer> li2 = new ArrayList<Integer>(); li2.add(40); li2.add(50);
		 * li2.add(60);
		 * 
		 * List<Integer> li3 = new ArrayList<Integer>(); li3.addAll(0, li);
		 * 
		 * li3.addAll(li.size(), li2); System.out.println(li3);
		 */

		// Write a program to convert a List into an array.
		/*
		 * Integer[] arr = li.toArray(new Integer[li.size()]); for (int i = 0; i <
		 * arr.length; i++) { System.out.print(arr[i]+" "); }
		 */

		// Write a program to count frequency of each element in a List.
		
		/*
		 * boolean[] visited = new boolean[li.size()]; int count = 0;
		 * 
		 * for (int i = 0; i < li.size(); i++) {
		 * 
		 * if(visited[i]) continue;
		 * 
		 * count = 1;
		 * 
		 * for (int j = i+1; j < li.size(); j++) { if(li.get(i) == li.get(j)) { count++;
		 * visited[j] = true; } }
		 * 
		 * System.out.println("Count of "+li.get(i)+" = "+count);
		 * 
		 * }
		 */
		 

		// Write a program to traverse a List using ListIterator in both directions.
		/*
		 * Iterator<Integer> itForward = li.iterator(); ListIterator<Integer> itBackward
		 * = li.listIterator(li.size());
		 * 
		 * while(itForward.hasNext()) { System.out.print(itForward.next()+" "); }
		 * System.out.println(); while (itBackward.hasPrevious()) {
		 * System.out.print(itBackward.previous()+" "); }
		 */

		// Write a program to make a List thread-safe.

		// ✔ Thread-safe
		// ❌ Iteration must be synchronized manually
		/*
		 * List<Integer> syncList = Collections.synchronizedList(li);
		 * 
		 * synchronized (syncList) { for(Integer i :li) { System.out.println(i); } }
		 */

		/*
		 * ✔ Fully thread-safe ✔ No need for synchronized block ✔ Best for read-heavy
		 * applications ❌ Extra memory overhead
		 */
		/*List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<Integer>(li);
		for (Integer i : li) {
			System.out.println(i);
		}*/
		
		/*
		Method	                        Thread-safe	    Performance	    Recommended
		Collections.synchronizedList	Yes	            Medium	        ⚠️ Sometimes
		CopyOnWriteArrayList	        Yes	            High (reads)	✅ Yes
		Vector	                        Yes	            Low	            ❌ No
		*/
		
		//Write a program to handle NullPointerException in collections safely.
		List<Integer> li = new ArrayList<Integer>();
		li.add(null);
		Integer value = li.get(0);
		try {			
			System.out.println(value+10);
		} catch (NullPointerException e) {
			System.out.println("Null pointer Exception is arise...");
		}
		System.out.println("Program is continues to run...");
		
		//Write a program to demonstrate ArrayList vs LinkedList performance.
		/*
		 * System.out.println("Arraylist adding:"); long start =
		 * System.currentTimeMillis(); List<Integer> li = new ArrayList<Integer>(); for
		 * (int i = 0; i < 10000; i++) { li.add(i); }
		 * System.out.println(System.currentTimeMillis() - start);
		 * 
		 * System.out.println("Arraylist getting:"); start = System.currentTimeMillis();
		 * for (int i = 0; i < 10000; i++) { li.get(i); }
		 * System.out.println(System.currentTimeMillis() - start);
		 * 
		 * System.out.println("Arraylist removing:"); start =
		 * System.currentTimeMillis(); for (int i = 10000-1; i >= 0; i--) {
		 * li.remove(i); } System.out.println(System.currentTimeMillis() - start);
		 * 
		 * System.out.println("Partial LinkList Adding:"); start =
		 * System.currentTimeMillis(); List<Integer> linklist = new
		 * LinkedList<Integer>(); for (int i = 0; i < 10000; i++) { linklist.add(i); }
		 * System.out.println(System.currentTimeMillis() - start);
		 * 
		 * System.out.println("Partial LinkList getting:"); start =
		 * System.currentTimeMillis(); for (int i = 0; i < 10000; i++) {
		 * linklist.get(i); } System.out.println(System.currentTimeMillis() - start);
		 * 
		 * System.out.println("Partial LinkList removing:"); start =
		 * System.currentTimeMillis(); for (int i = 10000-1; i >= 0; i--) {
		 * linklist.remove(i); } System.out.println(System.currentTimeMillis() - start);
		 * 
		 * System.out.println("LinkedList Adding:"); start = System.currentTimeMillis();
		 * LinkedList<Integer> linklist2 = new LinkedList<Integer>(); for (int i = 0; i
		 * < 10000; i++) { linklist2.add(i); }
		 * System.out.println(System.currentTimeMillis() - start);
		 * 
		 * System.out.println("LinkedList Getting:"); start =
		 * System.currentTimeMillis(); for (int i = 0; i < 10000; i++) {
		 * linklist2.get(i); } System.out.println(System.currentTimeMillis() - start);
		 * 
		 * System.out.println("LinkedList Removing:"); start =
		 * System.currentTimeMillis(); for (int i = 10000-1; i >= 0; i--) {
		 * linklist2.remove(i); } System.out.println(System.currentTimeMillis() -
		 * start);
		 */
		
	}

}

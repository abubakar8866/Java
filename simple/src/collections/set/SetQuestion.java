package collections.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to store unique values using HashSet.
		 * 
		 * Write a program to prove that HashSet does not allow duplicates.
		 * 
		 * Write a program to show that HashSet does not maintain insertion order.
		 * 
		 * Write a program to maintain insertion order using LinkedHashSet.
		 * 
		 * Write a program to store elements in sorted order using TreeSet.
		 * 
		 * Write a program to remove duplicate elements from an ArrayList using HashSet.
		 * 
		 * Write a program to find common elements between two Sets.
		 * 
		 * Write a program to find union of two Sets.
		 * 
		 * Write a program to find difference between two Sets.
		 * 
		 * Write a program to check whether an element exists in a Set.
		 * 
		 * Write a program to store custom objects in a HashSet.
		 * 
		 * Write a program to override equals() and hashCode() for Set usage.
		 * 
		 * Write a program to sort custom objects using TreeSet and Comparator.
		 * 
		 * Write a program to compare HashSet, LinkedHashSet, and TreeSet outputs.
		 * 
		 * Write a program to remove duplicates from a List while preserving insertion
		 * order.
		 * 
		 * Write a program to read user input and store unique sorted values.
		 * 
		 * Write a program to store product IDs,rpoduct name where duplicates are not allowed.
		 */

		// Write a program to store unique values using HashSet.
		// Write a program to prove that HashSet does not allow duplicates.
		// Write a program to show that HashSet does not maintain insertion order.
		/*
		 * Set<Integer> set = new HashSet<Integer>();
		 * 
		 * set.add(1); set.add(1); set.add(2); set.add(3); set.add(13); set.add(3);
		 * set.add(9); set.add(7); set.add(2); set.add(890); set.add(23); set.add(38);
		 * 
		 * System.out.println(set);
		 */

		// Write a program to maintain insertion order using LinkedHashSet.
		/*
		 * Set<Integer> set = new LinkedHashSet<Integer>();
		 * 
		 * set.add(1); set.add(1); set.add(2); set.add(3); set.add(13); set.add(3);
		 * set.add(9); set.add(7); set.add(2); set.add(890); set.add(23); set.add(38);
		 * 
		 * System.out.println(set);
		 */

		// Write a program to store elements in sorted order using TreeSet.
		/*
		 * Set<Integer> set = new TreeSet<Integer>();
		 * 
		 * set.add(1); set.add(1); set.add(2); set.add(3); set.add(13); set.add(3);
		 * set.add(9); set.add(7); set.add(2); set.add(890); set.add(23); set.add(38);
		 * 
		 * System.out.println(set);
		 */

		// Write a program to remove duplicate elements from an ArrayList using HashSet.
		/*
		 * List<Integer> li = new ArrayList<Integer>(); li.add(1); li.add(2); li.add(3);
		 * li.add(3);
		 * 
		 * Set<Integer> set = new HashSet<Integer>();
		 * 
		 * for(Integer i: li) { if(!set.add(li.get(i))) { li.remove(i); } }
		 * 
		 * System.out.println(li);
		 */

		// Write a program to find common elements between two Sets.
		// Write a program to find union of two Sets.
		// Write a program to find difference between two Sets.
		
		/*
		 * Set<Integer> set1 = new HashSet<Integer>(); set1.add(1); set1.add(2);
		 * set1.add(3); set1.add(4); set1.add(5);
		 * 
		 * Set<Integer> set2 = new HashSet<Integer>(); set2.add(4); set2.add(5);
		 * set2.add(6); set2.add(7); set2.add(8);
		 * 
		 * Set<Integer> common = new HashSet<Integer>(set1); common.retainAll(set2);
		 * System.out.println("Common: "+common);
		 * 
		 * Set<Integer> union = new HashSet<Integer>(set1); union.addAll(set2);
		 * System.out.println("Union: "+union);
		 * 
		 * Set<Integer> diff = new HashSet<Integer>(set1); diff.removeAll(set2);
		 * System.out.println("Difference: "+diff);
		 */

		// Write a program to check whether an element exists in a Set.
		/*
		 * int ele = 45; Set<Integer> set = new HashSet<Integer>();
		 * 
		 * set.add(1); set.add(2); set.add(45);
		 * 
		 * if(set.contains(ele)) { System.out.println(ele+" is exists."); }else {
		 * System.out.println(ele+" is not exists."); }
		 */

		// Write a program to store custom objects in a HashSet.
		// Write a program to override equals() and hashCode() for Set usage.
		
		/*
		 * Set<Student> stdSet = new HashSet<Student>(); stdSet.add(new Student(1,
		 * "abu")); stdSet.add(new Student(1, "abu")); stdSet.add(new Student(2,
		 * "bakar"));
		 * 
		 * for (Student student : stdSet) { System.out.println(student.toString()); }
		 * 
		 */
		// Write a program to sort custom objects using TreeSet and Comparator.
		
		/*
		 * Comparator<Student> getById = (s1,s2) -> s2.id - s1.id; Comparator<Student>
		 * getByName = (s3,s4) -> s3.name.compareTo(s4.name);
		 * 
		 * Comparator<Student> getByIdName = getById.thenComparing(getByName);
		 * 
		 * TreeSet<Student> stdTreeSet = new TreeSet<Student>(getByIdName);
		 * 
		 * stdTreeSet.add(new Student(2, "amin")); stdTreeSet.add(new Student(1,
		 * "abubakar")); stdTreeSet.add(new Student(2, "amin")); stdTreeSet.add(new
		 * Student(3, "khan"));
		 * 
		 * for (Student student : stdTreeSet) { System.out.println(student.toString());
		 * }
		 */
		 

		// Write a program to remove duplicates from a List while preserving insertion
		// order.
		/*
		 * LinkedHashSet<Integer> set = new LinkedHashSet<>(); set.add(1); set.add(2);
		 * set.add(1); set.add(2); set.add(4); System.out.println(set);
		 */

		// Write a program to read user input and store unique sorted values.
		
		  TreeSet<Integer> treeSet = new TreeSet<Integer>(); Scanner sc = new
		  Scanner(System.in); System.out.print("Enter value = "); int n = sc.nextInt();
		  treeSet.add(n); while(true) { System.out.print("Enter value = "); n =
		  sc.nextInt(); treeSet.add(n); System.out.
		  print("Are wanted you to continue: press 1 for continue otherwise enter 0 to exit = "
		  ); int ch = sc.nextInt(); if(ch == 0) { break; } }
		  System.out.println(treeSet); sc.close();
		 

		// Write a program to store product IDs where duplicates are not allowed.
		/*HashSet<Product> products = new HashSet<Product>();

		products.add(new Product(1, "Pen"));
		products.add(new Product(1, "Pen"));
		products.add(new Product(2, "Pen"));
		products.add(new Product(2, "Pencil"));
		products.add(new Product(3, "Ballpen"));

		for (Product prod : products) {
			System.out.println(prod.toString());
		}*/

	}

}

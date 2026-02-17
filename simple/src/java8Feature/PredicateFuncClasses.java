package java8Feature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFuncClasses {

	public static void main(String[] args) {
		//check condition then boolean only
		/*
		 * Predicate<Integer> predicate = num -> num == 0;
		 * System.out.println(predicate.test(-1));
		 */
		
		/*
		 * Filter a list of integers and print only even numbers.
		 * 
		 * Check if a string is empty or null.
		 * 
		 * Filter students whose marks are greater than 60.
		 * 
		 * Check if a password length is greater than 8.
		 * 
		 * Filter list of employees whose salary > 50000.
		 */

		//Filter a list of integers and print only even numbers.
		/*
		 * ArrayList<Integer> arrayList = new ArrayList<Integer>(List.of(1,2,3,4,5,6));
		 * System.out.println("Printing Even number:"); for(Integer i : arrayList) {
		 * Predicate<Integer> pred = n -> n%2 == 0; if(pred.test(i)) {
		 * System.out.print(i+" "); } }
		 */
		
		//Check if a string is empty or null.
		/*
		 * Predicate<String> pred = str -> str.isEmpty();
		 * System.out.println(pred.test("a"));
		 */
		
		//Check if a password length is greater than 8.
		/*
		 * Predicate<String> pred = pass -> pass.length()>8;
		 * System.out.println(pred.test("abubakkar"));
		 */
		
		//Filter list of employees whose salary > 50000.
		/*
		 * ArrayList<Employee> emArrayList = new ArrayList<Employee>();
		 * 
		 * emArrayList.add(new Employee(1, "abubakar", 70000.00)); emArrayList.add(new
		 * Employee(2, "aman", 40000.00)); emArrayList.add(new Employee(3, "altamash",
		 * 60000.00));
		 * 
		 * for(Employee emp : emArrayList) { Predicate<Double> pred = sal -> sal >
		 * 50000; if(pred.test(emp.salary)) { System.out.println(emp.id+","+emp.name); }
		 * }
		 */
		
	}
	
}

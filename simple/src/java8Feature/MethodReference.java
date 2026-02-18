package java8Feature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MethodReference {

	public static void main(String[] args) {

		/*
		 * Convert a List<String> to uppercase using method reference instead of lambda.
		 * Sort a list of employees by salary using method reference. Create objects of
		 * Student using constructor reference inside a stream.
		 */

		// Convert a List<String> to uppercase using method reference instead of lambda.
		/*
		 * ArrayList<String> arrayList = new
		 * ArrayList<String>(List.of("abu","bakar","khan")); List<String> upper =
		 * arrayList.stream() .map(String::toUpperCase) .toList();
		 * System.out.println(upper);
		 */

		// Sort a list of employees by salary using method reference.
		/*
		 * ArrayList<Employee> employees = new ArrayList<Employee>(); employees.add(new
		 * Employee(1, "abu", 70000.00)); employees.add(new Employee(2, "bakar",
		 * 60000.00)); employees.add(new Employee(3, "khan", 50000.00)); List<Employee>
		 * emp = employees.stream()
		 * .sorted(Comparator.comparing(Employee::getSalary).reversed()) .toList();
		 * System.out.println(emp);
		 */

		// Create objects of Student using constructor reference inside a stream.
		/*
		 * List<Integer> ids = List.of(1, 2, 3); List<String> names = List.of("abu",
		 * "aman", "khan");
		 * 
		 * 
		 * List<Student> students = IntStream.range(0, ids.size()) .mapToObj(i -> new
		 * Student(ids.get(i), names.get(i))) .toList();
		 * 
		 * 
		 * StudentFactory factory = Student::new;
		 * 
		 * List<Student> std = IntStream.range(0, ids.size()) .mapToObj(i ->
		 * factory.create(ids.get(i), names.get(i))) .toList(); System.out.println(std);
		 */

	}

}

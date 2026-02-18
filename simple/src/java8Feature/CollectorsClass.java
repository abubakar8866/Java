package java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsClass {

	public static void main(String[] args) {

		/*
		 * Convert List<String> into a comma-separated string. Group employees by
		 * department using Collectors.groupingBy(). Partition numbers into even and odd
		 * using partitioningBy(). Find average salary of employees using
		 * Collectors.averagingDouble(). Create a Map<Department, List<Employee>> from
		 * employee list.
		 */

		// Convert List<String> into a comma-separated string.
		/*
		 * List<String> names = List.of("Abu", "Aman", "Khan"); String result =
		 * names.stream() .collect(Collectors.joining(","));
		 * 
		 * System.out.println(result);
		 */

		// Group employees by department using Collectors.groupingBy().
		/*
		 * List<Emp> employees = new ArrayList<Emp>(); employees.add(new
		 * Emp("abu","IT",65000.78)); employees.add(new Emp("bakar","IT",75000.78));
		 * employees.add(new Emp("hamida","CS",45000.78)); employees.add(new
		 * Emp("amin","CS",75000.78)); Map<String, List<Emp>> grouped =
		 * employees.stream().collect(Collectors.groupingBy(Emp::getDepartment));
		 * System.out.println(grouped);
		 */

		// Partition numbers into even and odd using partitioningBy().
		/*
		 * List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6); Map<Boolean,
		 * List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(n
		 * -> n % 2 == 0)); System.out.println(result);
		 */
		
		//Find average salary of employees using Collectors.averagingDouble().
		/*
		 * List<Employee> employees = new ArrayList<Employee>(); employees.add(new
		 * Employee(1, "abu", 7890.45)); employees.add(new Employee(4, "bakar",
		 * 4589.45)); employees.add(new Employee(5, "amin", 7634.45)); employees.add(new
		 * Employee(6, "pathan", 9045.45)); double avgSalary = employees.stream()
		 * .collect(Collectors.averagingDouble(Employee::getSalary));
		 * System.out.println("Average Salary: " + avgSalary);
		 */

		//Create a Map<Department, List<Employee>> from employee list.
		List<Empl> employees = new ArrayList<>();

		Dept it = new Dept("IT");
		Dept hr = new Dept("HR");

		employees.add(new Empl("Abu", it));
		employees.add(new Empl("Aman", it));
		employees.add(new Empl("Khan", hr));

		Map<Dept, List<Empl>> result =
		        employees.stream()
		                .collect(Collectors.groupingBy(Empl::getDepartment));

		System.out.println(result);
		
	}

}

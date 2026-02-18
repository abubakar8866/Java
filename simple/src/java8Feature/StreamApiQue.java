package java8Feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiQue {

	public static void main(String[] args) {
		/*
			Given a List<Employee>, find employees whose salary > 50,000 and sort them by name.
			From a List<String>, count how many strings start with "A" (case insensitive).		
			Given a List<Integer>, remove duplicates and return the top 3 highest numbers.		
			From a List<Student>, group students by department and count students in each department.		
			Given a sentence, find the frequency of each word using Streams.
		*/
		
		//Given a List<Employee>, find employees whose salary > 50,000 and sort them by name.
		/*
		 * ArrayList<Employee> employees = new ArrayList<Employee>();
		 * 
		 * employees.add(new Employee(3,"sahil", 60000.00)); employees.add(new
		 * Employee(2, "aman", 40000.00)); employees.add(new Employee(1, "abubakar",
		 * 70000.00));
		 * 
		 * List<Employee> emp = employees.stream() .filter( e -> e.salary > 50000.00)
		 * .sorted(Comparator.comparing(e1 -> e1.name)) .toList(); for(Employee e : emp)
		 * { System.out.println(e.id+","+e.name+","+e.salary); }
		 */
		
		//From a List<String>, count how many strings start with "A" (case insensitive).
		/*
		 * ArrayList<String> arrayList = new
		 * ArrayList<String>(List.of("Abu","bakar","abu","Almass"));
		 * 
		 * Long count = arrayList.stream() .map(e1 -> e1.toLowerCase()) .filter(e ->
		 * e.startsWith("a")) .count(); System.out.println(count);
		 */
		
		//Given a List<Integer>, remove duplicates and return the top 3 highest numbers.
		/*
		 * List<Integer> list = new ArrayList<Integer>(List.of(1,2,2,3,3,4,5));
		 * List<Integer> top3 = list.stream() .distinct()
		 * .sorted(Comparator.reverseOrder()) .limit(3) .toList();
		 * System.out.println(top3);
		 */
		
		//From a List<Student>, group students by department and count students in each department.
		/*
		 * List<Std> listStd = new ArrayList<Std>(); listStd.add(new
		 * Std(1,"abubakar","IT")); listStd.add(new Std(2,"abu","CS")); listStd.add(new
		 * Std(3,"amin","Teacher")); listStd.add(new Std(4,"bakar","IT"));
		 * listStd.add(new Std(5,"khan","IT"));
		 * 
		 * Map<String,Long> deptcnt = listStd.stream() .collect(Collectors.groupingBy(s
		 * -> s.department,Collectors.counting())); System.out.println(deptcnt);
		 */
		
		//Given a sentence, find the frequency of each word using Streams.
		/*
		 * String sentence = "Java is good and java is powerfull"; Map<String,Long>
		 * wordCnt = Arrays.stream(sentence.toLowerCase().split("\\s+"))
		 * .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 * System.out.println(wordCnt);
		 */
		
	}

}

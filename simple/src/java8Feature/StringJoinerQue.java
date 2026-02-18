package java8Feature;

import java.util.List;
import java.util.StringJoiner;

public class StringJoinerQue {

	public static void main(String[] args) {
		
		/*
		Join list of names with delimiter ", ".
		Create a JSON-style output using prefix { and suffix } using StringJoiner.		
		Merge two StringJoiner objects.
		*/
		
		//Join list of names with delimiter ", ".
		/*
		 * List<String> names = List.of("Abu", "Aman", "Khan"); StringJoiner sj = new
		 * StringJoiner(", "); for (String name : names) { sj.add(name); }
		 * System.out.println(sj);
		 */
		
		//Create a JSON-style output using prefix { and suffix } using StringJoiner.
		/*
		 * StringJoiner sj = new StringJoiner(", ", "{", "}");
		 * sj.add("\"name\":\"Abu\""); sj.add("\"age\":25");
		 * sj.add("\"city\":\"Ahmedabad\""); System.out.println(sj);
		 */
		
		//Merge two StringJoiner objects.
		/*
		 * StringJoiner sj1 = new StringJoiner(", "); sj1.add("Abu"); sj1.add("Aman");
		 * 
		 * StringJoiner sj2 = new StringJoiner(", "); sj2.add("Khan"); sj2.add("Ali");
		 * 
		 * sj1.merge(sj2);
		 * 
		 * System.out.println(sj1);
		 */
		
	}

}

package java8Feature;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Function;

public class FuncInterfaceClasses {

	public static void main(String[] args) {
		//action baed on user input any value and give that data type output only
		/*
		 * Function<String, Integer> fun = input -> input.length();
		 * 
		 * System.out.println(fun.apply("abubakar"));
		 */
		
		/*
		 * Convert a list of String names to uppercase using Function.
		 * 
		 * Convert a Student object into a String like "ID - Name".
		 * 
		 * Write a function that takes an integer and returns its square.
		 * 
		 * Convert a LocalDate to formatted string "dd-MM-yyyy".
		 * 
		 * Extract email domain from email string using Function<String, String>.
		 */
		
		//Convert a list of String names to uppercase using Function.
		/*
		 * ArrayList<String> inputStr = new ArrayList<String>(); ArrayList<String>
		 * outputStr = new ArrayList<String>();
		 * 
		 * inputStr.add("Abu"); inputStr.add("bakar"); inputStr.add("khan");
		 * 
		 * for(String str : inputStr) { Function<String, String> fun = stri ->
		 * stri.toUpperCase(); outputStr.add(fun.apply(str)); }
		 * 
		 * for(String str : outputStr) { System.out.println(str); }
		 */
		
		//Convert a Student object into a String like "ID - Name".		
		/*
		 * Function<Student, String> fun = std -> std.toString();
		 * System.out.println(fun.apply(new Student(1, "abubakar")));
		 */
		
		//Write a function that takes an integer and returns its square.
		/*
		 * Function<Integer, Integer> fun = (intpt) -> {return (intpt * intpt);};
		 * System.out.println(fun.apply(10));
		 */
		
		//Convert a LocalDate to formatted string "dd-MM-yyyy".
		/*
		 * Function<LocalDate,String> fun = itpt -> itpt.toString();
		 * System.out.println(fun.apply(LocalDate.now()));
		 */
		
		//Extract email domain from email string using Function<String, String>.
		Function<String, String> fun = (eml) -> {
			int indx = eml.indexOf('@');
			String str = eml.substring(indx+1);
			return str;
		};
		System.out.println(fun.apply("abu@gmail.com"));
	}

}

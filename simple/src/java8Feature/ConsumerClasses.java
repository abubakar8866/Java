package java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClasses {

	public static void main(String[] args) {
		// accept input then process it and not return any value.
		/*
		 * Consumer<String> con = (input) -> { System.out.println(input.toLowerCase());
		 * }; con.accept("ABU");
		 */
		
		/*
		Print all elements of a list using Consumer.
		Increase salary of employee by 10% using Consumer.		
		Log user activity using Consumer<String>.		
		Send notification to user using Consumer<User>.		
		Store data into file/database using Consumer.
		*/
		
		//Print all elements of a list using Consumer.
		/*
		 * ArrayList<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7));
		 * Consumer<ArrayList<Integer>> cons = num -> System.out.print(num+" ");
		 * cons.accept(list);
		 */
		
		//Increase salary of employee by 10% using Consumer.
		/*
		 * ArrayList<Integer> list = new
		 * ArrayList<Integer>(List.of(1000,2000,3000,4000,5000));
		 * Consumer<ArrayList<Integer>> cons = (salList) ->{ for(Integer i : salList) {
		 * i = i+((i*10)/100); System.out.print(i+" "); } }; cons.accept(new
		 * ArrayList<Integer>(list));
		 */
		
		//Log user activity using Consumer<String>
		/*
		 * Consumer<String> cons = user ->
		 * System.out.println(user+" is currently login..."); cons.accept("abu");
		 */
		
		//Send notification to user using Consumer<User>.
		/*
		 * Consumer<String> cons = user ->
		 * System.out.println(user+" is going to office..."); cons.accept("abu");
		 */
		
		//Store data into file/database using Consumer.
		/*
		 * Consumer<String> cons = user ->
		 * System.out.println(user+" data is stored into database...");
		 * cons.accept("abu");
		 */
		
	}

}

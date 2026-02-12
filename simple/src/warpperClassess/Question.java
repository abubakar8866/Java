package warpperClassess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question {

	public static void main(String[] args) {

		/*
		 * Wrapper Classes – 30 Practical Questions 🔹 Basic Conversions 1️⃣ Convert int
		 * to Integer using autoboxing. 2️⃣ Convert Integer to int using unboxing. 3️⃣
		 * Convert String to int using Integer.parseInt(). 4️⃣ Convert String to Integer
		 * using Integer.valueOf(). 5️⃣ Convert String to double using
		 * Double.parseDouble(). 🔹 Wrapper Methods Usage 6️⃣ Write a program to use
		 * xxxValue() methods. 7️⃣ Write a program to use toString() of wrapper class.
		 * 8️⃣ Write a program using compare() method of Integer. 9️⃣ Write a program
		 * using equals() method. 🔟 Display MAX_VALUE and MIN_VALUE of Integer. 🔹
		 * Autoboxing / Unboxing 1️⃣1️⃣ Write a program to demonstrate autoboxing.
		 * 1️⃣2️⃣ Write a program to demonstrate unboxing. 1️⃣3️⃣ Write a program to
		 * show wrapper classes in collections. 🔹 Exception Based 1️⃣4️⃣ Demonstrate
		 * NumberFormatException using wrapper class. 1️⃣5️⃣ Handle
		 * NumberFormatException using try-catch. 🔹 Comparison & Caching 1️⃣6️⃣ Compare
		 * two Integer objects using ==. 1️⃣7️⃣ Compare two Integer objects using
		 * .equals(). 1️⃣8️⃣ Show Integer caching behavior (-128 to 127). 🔹 Character
		 * Wrapper 1️⃣9️⃣ Check whether a character is digit. 2️⃣0️⃣ Check whether a
		 * character is alphabet. 2️⃣1️⃣ Convert lowercase to uppercase using Character
		 * class. 🔹 Boolean Wrapper 2️⃣2️⃣ Convert String "true" to boolean. 2️⃣3️⃣
		 * Demonstrate Boolean.valueOf(). 🔹 Advanced / Mixed 2️⃣4️⃣ Convert int →
		 * String using wrapper class. 2️⃣5️⃣ Convert double → String using wrapper
		 * class. 2️⃣6️⃣ Store different wrapper objects in a collection. 2️⃣7️⃣
		 * Demonstrate wrapper classes are immutable. 2️⃣8️⃣ Write a program to read
		 * numeric input using wrapper class. 2️⃣9️⃣ Write a program to sort Integer
		 * objects in a list. 3️⃣0️⃣ Write a program combining parseXxx(), valueOf(),
		 * autoboxing.
		 */
		
		//1Convert int to Integer using autoboxing.
		/*int i = 78;
		Integer f = i;
		System.out.println(f);*/
		
		//2Convert Integer to int using unboxing.
		/*Integer y = 34;
		int h = y;
		System.out.println(h);*/
		
		//3Convert String to int using Integer.parseInt().
		/*String s = "123";
		int n = Integer.parseInt(s);
		System.out.println(n);*/
		
		//4Convert String to Integer using Integer.valueOf().
		/*String s = "43454";
		Integer i = Integer.valueOf(s);
		System.out.println(i);*/
		
		//5Convert String to double using Double.parseDouble().
		/*String s = "34.56";
		double d = Double.parseDouble(s);
		System.out.println(d);*/
		
		//6Write a program to use xxxValue() methods.
		/*Integer i = 56;
		int j = i.intValue();
		System.out.println(j);*/
		
		//7Write a program to use toString() of wrapper class.
		/*Integer n = 89;
		String s = n.toString();
		System.out.println(s);*/
		
		//8Write a program using compare() method of Integer.
		/*Integer i = 30;
		Integer j = 20;
		System.out.println(Integer.compare(i, j));*/
		
		//9Write a program using equals() method.
		/*Integer i = 90;
		String j = "90";
		System.out.println(i.equals(j));*/
		
		//10Display MAX_VALUE and MIN_VALUE of Integer. 
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		
		//11Write a program to demonstrate autoboxing.
		/*int n = 90;
		Integer i = n;
		System.out.println(i);*/
		
		//12Write a program to demonstrate unboxing.
		/*Integer a = 90;
		int i = a.intValue();
		System.out.println(i);*/
		
		//13Write a program to show wrapper classes in collections.
		/*List<Integer> intList = new ArrayList<Integer>();
		intList.add(34);
		intList.add(23);
		intList.add(12);
		System.out.println(intList);*/
		
		//14Demonstrate NumberFormatException using wrapper class.
		/*String i = "abc123";
		int n = Integer.parseInt(i);
		System.out.println(n);*/
		
		//15Handle NumberFormatException using try-catch.
		/*String i = "abc123";
		Integer n = 0;
		try {			
			n = Integer.valueOf(i);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(n);*/
		
		//16Compare two Integer objects using ==.
		/*Integer i = 10;
		Integer j = 10;
		
		Integer k = 200;
		Integer l = 200;
		
		System.out.println(i==j); //i == j is true because Java caches Integer objects between -128 and 127, so both references point to the same object.
		System.out.println(k==l); //200 is outside cache range,Java creates two different Integer objects,References are different → false*/
		
		//17Compare two Integer objects using .equals().
		/*Integer i = 10;
		Integer j = 10;
		
		System.out.println(i.equals(j));*/
		
		//18Show Integer caching behavior (-128 to 127).
		/*Integer i = 122;
		Integer j = 122;
		System.out.println(i == j);*/
		
		//19Check whether a character is digit.
		/*String s = "qwerty123";
		boolean isDigit = false;
		
		for (int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))){
				isDigit = true;
				break;
			}
		}
		
		System.out.println(s.matches(".*\\d+.*"));
		System.out.println(isDigit);*/
		
		//20Check whether a character is alphabet.
		/*String str = "1234rt";
		Boolean isAphabet = false;
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				isAphabet = true;
			}
		}
		
		System.out.println(isAphabet);
		System.out.println(str.matches(".*[A-Za-z]+.*")); //.* --> anything before after, matches whole string*/
		
		//21Convert lowercase to uppercase using Character class.
		/*StringBuilder sb = new StringBuilder("java");
		
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if(Character.isLowerCase(c)) {
				char upper = Character.toUpperCase(c);
				sb.replace(i, i+1, String.valueOf(upper));
			}
		}
		
		System.out.println(sb);*/
		
		//22Convert String "true" to boolean.
		//23Demonstrate Boolean.valueOf().
		/*String s = "true";
		boolean bool = Boolean.valueOf(s);
		if(bool) {
			System.out.println(bool);
		}*/
		
		//24Convert int → String using wrapper class.
		/*int n = 45;
		String s = Integer.toString(n);
		System.out.println(s);*/
		
		//25Convert double → String using wrapper class.
		/*double d = 34.67;
		String s = Double.toString(d);
		System.out.println(s);*/
		
		//26Store different wrapper objects in a collection.
		/*List<Object> list = new ArrayList<Object>();
		
		String s = "abu";
		Integer i = 12;
		Float f = 23.45f;
		boolean b = true;
		
		list.add(s);
		list.add(i);
		list.add(f);
		list.add(b);
		
		System.out.println(list);*/
		
		//27Demonstrate wrapper classes are immutable.
		//Integer a = 10;
		//Integer b = a;
		
		/*int a = 10;
		
		int b = 23;
		a = a + 45;
		b = a;
		
		System.out.println(a);
		System.out.println(b);*/
		
		/*StringBuilder sb = new StringBuilder("rty");
		StringBuilder sb1 = sb;
		
		sb.append("er");
		
		System.out.println(sb);
		System.out.println(sb1);*/
		
		//28Write a program to read numeric input using wrapper class.
		/*Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		System.out.println(n);
		sc.close();*/
		
		//29Write a program to sort Integer objects in a list.
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(0);
		
		Collections.sort(list);
		
		System.out.println(list);*/
		
		//30Write a program combining parseXxx(), valueOf(), autoboxing.
		/*String s = "123";
		int n = Integer.parseInt(s);
		Integer i = Integer.valueOf(n);
		System.out.println(i);*/
		
	}

}

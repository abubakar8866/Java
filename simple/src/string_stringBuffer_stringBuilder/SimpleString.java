package string_stringBuffer_stringBuilder;

//import java.util.Arrays;

public class SimpleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// contains()  --> finds a substring or a single character (letter/digit/symbol) WITHOUT regex
		// endsWith()  --> checks if the string ends with a particular suffix
		// startsWith()--> checks if the string starts with a particular prefix

		// Pattern.compile("\\d+").matcher(str).find()
		// --> similar to contains(), but WITH regex (searches anywhere in the string)

		// Pattern.matches(regex, input)
		// --> matches the ENTIRE string against the regex (validation)
		
		//String literal --> store in string constant pool
		//String str = "abu";
		//String str2 = "abu";
		//System.out.println(str == str2);
		
		//Using new keyword
		//String str1 = new String("abu");
		
		//new object and store in another reference
		//str1 = str1.concat(str);
		//System.out.println(str1);
		
		//== check refernce
		//System.out.println(str == str1);
		
		//.equals check actual content
		//System.out.println(str.equals(str1));
		
		//length
		//System.out.println(str.length());
		
		//To get character at specific index
		/*for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();*/
		
		//It is method to check wheather String is empty or not
		//System.out.println(str.isEmpty());
		
		//It is used to equals with ignoring case
		/*String str3 = "Abu";
		String str4 = "abu";
		System.out.println(str3.equalsIgnoreCase(str4));*/
		
		//It is used to compare length of string.
		//System.out.println(str.compareTo(str2));
		
		//It is used to see wheather String contains or not 
		//String sstr = "Java Programming";
		//System.out.println(sstr.contains("a"));
		
		//It is used to convert to lowercase
		//System.out.println(str.toLowerCase());
		
		//It is used to convert to uppercase
		//System.out.println(str.toUpperCase());
		
		//It is used to give slice of string
		//System.out.println(str.substring(1));
		//System.out.println(str.substring(2, 2));
		
		//It is used to extract first index of specific char
		//System.out.println(str.indexOf('a'));
		
		//It is used to extract last index of specific char			
		//System.out.println(str.lastIndexOf('u'));
		
		//It is used to check starting string		
		//String str3 = "Java programming";
		//System.out.println(str3.startsWith("Java"));
		
		//It is used to check string ends with
		//String str3 = "Java programming";
		//System.out.println(str3.endsWith("ming"));
		
		//It is used to replace char/string
		//System.out.println(str.replace("abu", "bakar"));
		
		//It is used to split String
		//String str3 = "Java Program ming";
		//String[] arr = str3.split(" ",3);
		//System.out.println(Arrays.toString(arr));
		
		//It is used to delete space before and after word
		//String trim = " java ";
		//System.out.println(trim);
		//System.out.println(trim.trim());
		
		//It is used to extract whole string into character array
		//String s = "Jav   a";
		//char[] c = s.toCharArray();
		//System.out.println(Arrays.toString(c));
		
		//It is used to convert any datatype value into String
		//int v = 100;
		//String s = String.valueOf(v);
		//System.out.println(s);
		//System.out.println(s.getClass().getSimpleName());
		
		//intern() checks whether an equal String already exists in the String Constant Pool.If it exists, it returns its reference;otherwise, it adds the string to the pool and returns the pooled reference.
		/*String s1 = new String("abu");
		String s2 = s1.intern();
		String s3 = "abu";
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));*/
		
		//matches() checks whether the complete string matches the given regular expression.
		//System.out.println("java developer".matches("java"));
		
		/*🔹 BASIC REGULAR EXPRESSIONS
		Regex	     Meaning
		.	         Any single character
		\\d	         Any digit (0–9)
		\\D	         Any non-digit
		\\w	         Letter, digit, or _
		\\W	         Non-word character
		\\s	         Whitespace (space, tab)
		\\S	         Non-whitespace
		
		🔹 CHARACTER CLASSES
		Regex	    Meaning
		[abc]	    a or b or c
		[a-z]	    lowercase letters
		[A-Z]	    uppercase letters
		[a-zA-Z]	any alphabet
		[0-9]	    any digit
		[^a-z]	    NOT lowercase letters
		
		🔹 QUANTIFIERS (How many times)
		Regex	Meaning
		?	    0 or 1 time
		*	    0 or more times
		+	    1 or more times
		{n}	    exactly n times
		{n,}	at least n times
		{n,m}	between n and m times
		
		🔹 POSITION (Anchors)
		Regex	Meaning
		^	    Start of string
		$	    End of string
		\\b	    Word boundary
		
		🔹 COMMON VALIDATION REGEX (🔥 VERY IMPORTANT)
		✔ Only digits
		\\d+

		✔ Only alphabets
		[a-zA-Z]+

		✔ Alphanumeric
		[a-zA-Z0-9]+

		✔ Username (5–15 chars)
		[a-zA-Z0-9_]{5,15}

		✔ Indian mobile number
		[6-9][0-9]{9}
		Part	Meaning
		[6-9]	First digit must be 6, 7, 8, or 9
		[0-9]	Any digit from 0–9
		{9}	    Exactly 9 times

		✔ Email (basic)
		[a-zA-Z0-9._]+@[a-zA-Z]+\\.com

		✔ Password (min 8 chars, 1 digit, 1 special)
		(?=.*\\d)(?=.*[@#$%!]).{8,}
		
		1️⃣ (?=.*\\d) → at least one digit
		?= → positive lookahead (check, don’t consume)
		.* → any characters
		\\d → a digit (0–9)
		👉 Means: Somewhere in the string, one digit must exist

        2️⃣ (?=.*[@#$%!]) → at least one special character
        [@#$%!] → allowed special character
        👉 Means:Somewhere in the string, one special character must exist

        3️⃣ .{8,} → minimum length
        . → any character
        {8,} → at least 8 characters        		
		*/
		
		String mobile = "9876543210";

		if (mobile.matches("[6-9][0-9]{9}")) {
		    System.out.println("Valid mobile number");
		} else {
		    System.out.println("Invalid mobile number");
		}

		
	}

}

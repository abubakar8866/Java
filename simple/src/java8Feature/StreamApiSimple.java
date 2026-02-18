package java8Feature;

import java.util.Base64;

//import javax.script.ScriptEngine;

public class StreamApiSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList<Integer> arrayList = new
		 * ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8));
		 * 
		 * arrayList.stream().filter(x -> x>5).forEach(System.out::println);
		 */
		
		//method reference -- it is shorthand of lamda expression. not work when collection come.Only work with one at a time data
		//ClassName::methodName
		//System.out::println
		
		//Optional Class -- avoid NullPointerException
		/*
		 * Optional<Integer> optional = Optional.ofNullable(null);
		 * System.out.println(optional.orElse(5));
		 */
		
		//Date and time Api
		/*
		 * LocalDate date = LocalDate.now(); System.out.println(date);
		 * 
		 * LocalTime time = LocalTime.now(); System.out.println(time);
		 * 
		 * LocalDateTime localDateTime = LocalDateTime.now();
		 * System.out.println(localDateTime);
		 */
		
		//Nashorn JavaScript Engine
		//Allows java application to execute Javascript code
		/*
		 * ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		 * engine.eval("print('Hello Javascript')");
		 */
		
		//Parallel stream allows parallel processing of stream operations using multi-core processors.
		
		//Collectors Class -- it is a utility class used to collect stream elements in to collections
				
		//StringJoiner -- Join String with delimiter, prefix and suffix. mutable.
		/*
		 * StringJoiner stringJoiner = new StringJoiner(",","[","]");
		 * stringJoiner.add("Abubakar"); stringJoiner.add("Amin");
		 * stringJoiner.add("khan"); System.out.println(stringJoiner);
		 */
		
		//Base64 Encoding and decoding
//		String encode =Base64.getEncoder().encodeToString("abu".getBytes());
//		System.out.println(encode);
		
		String b=Base64.getEncoder().encodeToString("abu".getBytes());
		//byte [] ba=b.getBytes(); 
		System.out.println(b);
		
		byte[] de=Base64.getDecoder().decode(b);
		String s=new String(de);
		System.out.println(s);	
		
	}

}

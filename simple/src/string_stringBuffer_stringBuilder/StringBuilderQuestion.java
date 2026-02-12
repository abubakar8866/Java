package string_stringBuffer_stringBuilder;

public class StringBuilderQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse String using StringBuilder
		/*String str = "Java";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());*/
        
        //Append multiple Strings using StringBuilder
        /*StringBuilder sb = new StringBuilder();
        sb.append("Java").append(" ").append("Full").append(" ").append("Stack");
        System.out.println(sb);*/
		
		//Insert a word at specific position
		/*StringBuilder sb = new StringBuilder("Java Stack");
        sb.insert(5, "Full ");
        System.out.println(sb);*/
		
		//Delete characters from StringBuilder
		/*StringBuilder sb = new StringBuilder("JavaProgramming");
        sb.delete(4, 15);
        System.out.println(sb);*/
		
		//Replace part of StringBuilder
		/*StringBuilder sb = new StringBuilder("Java is hard");
        sb.replace(8, 12, "easy");
        System.out.println(sb);*/
		
		//Check length and capacity
		/*StringBuilder sb = new StringBuilder("Javahdihcnldsknvlkdsnklcnds");
        System.out.println(sb.length());
        System.out.println(sb.capacity());*/
		
		//Convert StringBuilder to String
		/*StringBuilder sb = new StringBuilder("Java");
        String str = sb.toString();
        System.out.println(str);*/
		
		//Remove vowels using StringBuilder
		/*StringBuilder sb = new StringBuilder("JavaProgramming");

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb);*/
		
		//Reverse each word using StringBuilder
		/*String str = "Java is fun";
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(result);*/
		
		//Build a sentence dynamically
		/*StringBuilder sb = new StringBuilder();
        sb.append("I").append(" ").append("love").append(" ").append("Java");
        System.out.println(sb);*/
		
		//Demonstrate mutable behavior
		/*StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);*/
		
		//Clear StringBuilder content
		/*StringBuilder sb = new StringBuilder("Java");
        sb.setLength(0);
        System.out.println(sb);*/
		
		//Compare performance: String vs StringBuilder
		/*long start = System.currentTimeMillis();
		System.out.println(start);
        String s = "";
        for (int i = 0; i < 10000; i++) {
            s += i;
        }
        System.out.println("String time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        System.out.println("StringBuilder time: " + (System.currentTimeMillis() - start));*/
		
		//Remove digits from StringBuilder
		/*StringBuilder sb = new StringBuilder("Java123Full456");

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb);*/
		
		//Toggle case using StringBuilder
		StringBuilder sb = new StringBuilder("JaVa");

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (Character.isUpperCase(ch)) {
                sb.setCharAt(i, Character.toLowerCase(ch));
            } else {
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }

        System.out.println(sb);
        
	}

}

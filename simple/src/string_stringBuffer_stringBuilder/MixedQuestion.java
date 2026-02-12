package string_stringBuffer_stringBuilder;

public class MixedQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convert String → StringBuilder → StringBuffer
		/*String str = "Java";
        StringBuilder sb = new StringBuilder(str);
        StringBuffer buffer = new StringBuffer(sb);
        System.out.println(buffer);*/
		
		//Show immutability of String
		/*String s = "Java";
        s.concat(" Programming");

        System.out.println(s);*/
		
		//Show mutability of StringBuilder
		/*StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");

        System.out.println(sb);*/
		
		//Show thread safety of StringBuffer
		/*StringBuffer sb = new StringBuffer();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("A");
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start(); t2.start();
        try {
          t2.join();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println(sb.length());*/
		
		//Remove duplicate words using StringBuilder
		/*String str = "Java is Java very very powerful";
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (result.indexOf(words[i]) == -1) {
                result.append(words[i]).append(" ");
            }
        }

        System.out.println(result);*/
		
		//Format text using StringBuilder
		/*StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append("Abubakar\n")
          .append("Course: ").append("MCA\n")
          .append("Skill: ").append("Java");

        System.out.println(sb);*/
		
		//Reverse a sentence using StringBuffer
		/*String sentence = "Java is powerful";
        StringBuffer sb = new StringBuffer(sentence);

        System.out.println(sb.reverse());*/
		
		//Count words using String methods
		/*String str = "Java is very powerful language";
        String[] words = str.trim().split("\\s+");
        System.out.println(words.length);*/
		
		//Merge two Strings efficiently
		/*String s1 = "Java";
        String s2 = "Programming";

        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(" ").append(s2);

        System.out.println(sb);*/
		
		//Text Analyzer (Beginner Mini Project)
		/*String text = "Java is Java and Java is powerful";

        // Count words
        String[] words = text.split("\\s+");
        System.out.println("Word Count: " + words.length);

        // Remove duplicate words
        StringBuilder unique = new StringBuilder();
        for (String word : words) {
            if (unique.indexOf(word) == -1) {
                unique.append(word).append(" ");
            }
        }
        System.out.println("Without Duplicates: " + unique);

        // Reverse sentence
        StringBuffer reversed = new StringBuffer(text);
        System.out.println("Reversed: " + reversed.reverse());*/
		
	}

}

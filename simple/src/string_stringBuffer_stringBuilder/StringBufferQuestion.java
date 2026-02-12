package string_stringBuffer_stringBuilder;

import java.util.Scanner;

public class StringBufferQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse String using StringBuffer
		/*StringBuffer sb = new StringBuffer("Java");
        System.out.println(sb.reverse());*/
		
		//Append text in StringBuffer
		/*StringBuffer sb = new StringBuffer("Java");
        sb.append(" ").append("Programming");
        System.out.println(sb);*/
		
		//Insert and delete characters
		/*StringBuffer sb = new StringBuffer("Java Stack");

        sb.insert(5, "Full ");
        sb.delete(10, 16);

        System.out.println(sb);*/
		
		//Replace part of StringBuffer
		 /*StringBuffer sb = new StringBuffer("Java is hard");
	        sb.replace(8, 12, "easy");
	        System.out.println(sb);*/
		
		//Convert StringBuffer to String
		/*StringBuffer sb = new StringBuffer("Java");
        String str = sb.toString();
        System.out.println(str);*/
		
		//Check thread-safe behavior
		/*StringBuffer sb = new StringBuffer();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("X");
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {}

        System.out.println(sb.length());*/
		
		//Use StringBuffer in multi-threading
		/*StringBuffer sb = new StringBuffer();

        Thread t1 = new MyTask(sb);
        Thread t2 = new MyTask(sb);

        t1.start();
        t2.start();
        try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        System.out.println(sb);*/
		
		//Clear StringBuffer content
		/*StringBuffer sb = new StringBuffer("Java");
        sb.setLength(0);
        System.out.println(sb);*/
		
		//Demonstrate mutable behavior
		 /*StringBuffer sb = new StringBuffer("Java");
	     sb.append(" Full Stack");
	     System.out.println(sb);*/
		
		//Compare StringBuffer and StringBuilder
		/*long start = System.currentTimeMillis();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sb1.append(i);
        }
        System.out.println("StringBuffer time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb2.append(i);
        }
        System.out.println("StringBuilder time: " + (System.currentTimeMillis() - start));*/
		
		//Remove special characters
		/*StringBuffer sb = new StringBuffer("Java@123#Full!");
        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isLetterOrDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);*/
		
		//Count characters using StringBuffer
		/*StringBuffer sb = new StringBuffer("Java");
        System.out.println(sb.length());*/
		
		//Build large text efficiently
		/*StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 10000; i++) {
            sb.append("Line ").append(i).append("\n");
        }
        System.out.println(sb.length());*/
		
		//Check capacity growth
		/*StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("JavaProgrammingLanguage");
        System.out.println(sb.capacity());*/
		
		//Append user input dynamically
		/*Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        System.out.print("Enter text: ");
        sb.append(sc.nextLine());

        System.out.println(sb);
		sc.close();*/
	}

}

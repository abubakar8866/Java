package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuffferedReaderWriters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * BufferedWriter bw = new BufferedWriter(new
		 * FileWriter("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads/1.txt"));
		 * 
		 * bw.write("This is overridden...");
		 * 
		 * bw.newLine();
		 * 
		 * bw.write("My name is abubakar");
		 * 
		 * bw.close();
		 */
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads/1.txt"));
		
		String s;
		
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		
		br.close();
	}

}

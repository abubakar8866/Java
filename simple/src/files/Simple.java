package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Simple {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\1.txt");

		file.createNewFile();
		
		/*FileWriter fw = new FileWriter(file);
		
		//fw.write("abubakar");
		fw.append("     nm");
		fw.close();*/
		
		FileReader fr = new FileReader(file);
		
		int i;
		
		while ((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
		
		fr.close();
		
	}

}

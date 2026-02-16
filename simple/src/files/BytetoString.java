package files;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BytetoString {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\1.txt"));
		while(true) {
			try {				
				Normal normal = (Normal) inputStream.readObject();
				System.out.println(normal.id);
				System.out.println(normal.name);
			}catch(EOFException ex) {
				break;
			}
		}
		inputStream.close();
	}

}

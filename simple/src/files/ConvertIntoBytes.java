package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ConvertIntoBytes {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Normal normal = new Normal(1, "abubakar");
		Normal normal2 = new Normal(2, "abubakar");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\1.txt"));
		objectOutputStream.writeObject(normal);
		objectOutputStream.writeObject(normal2);
		objectOutputStream.close();
	}
	
}

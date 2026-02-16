package files;

import java.io.*;

//Serializable class
class User implements Serializable {

	private static final long serialVersionUID = 1L; // version control

	private String username;
	private transient String password; // sensitive (not serialized)
	private int age;

	public User(String username, String password, int age) {
		this.username = username;
		this.password = password;
		this.age = age;
	}

	// Custom serialization control
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject(); // serialize normal fields
		System.out.println("Custom writeObject executed");
	}

	// Custom deserialization control
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		ois.defaultReadObject(); // restore normal fields
		System.out.println("Custom readObject executed");
	}

	@Override
	public String toString() {
		return "Username: " + username + ", Password: " + password + ", Age: " + age;
	}
}
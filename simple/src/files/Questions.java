package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Questions {

	private static final Object lock = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * File (java.io.File)
		 * 
		 * How do you validate a file’s existence, permissions, and path before
		 * processing it?
		 * 
		 * How would you safely create directory structures if they do not exist?
		 * 
		 * How do you handle OS-dependent file paths in production systems?
		 * 
		 * How do you list and filter files in a directory based on extension?
		 * 
		 * How do you handle symbolic links and invalid paths?
		 * 
		 * 🔹 FileWriter
		 * 
		 * How do you write text data to a file while ensuring data consistency?
		 * 
		 * How would you append data to a file without overwriting existing content?
		 * 
		 * How do you handle partial writes when an exception occurs?
		 * 
		 * Why is FileWriter not recommended for high-performance systems?
		 * 
		 * How do you ensure character encoding correctness when using FileWriter?
		 * 
		 * 🔹 FileReader
		 * 
		 * How do you read text files safely using FileReader?
		 * 
		 * Why is FileReader unsuitable for large files in production?
		 * 
		 * How do you handle FileNotFoundException using FileReader?
		 * 
		 * How do you detect end-of-file while reading characters?
		 * 
		 * How do you handle encoding mismatches while reading files?
		 * 
		 * 🔹 BufferedReader
		 * 
		 * Why is BufferedReader preferred over FileReader in enterprise applications?
		 * 
		 * How do you read large files line-by-line efficiently?
		 * 
		 * How would you skip header lines in a CSV file using BufferedReader?
		 * 
		 * How do you handle malformed lines during file processing?
		 * 
		 * How do you ensure proper resource management when using BufferedReader?
		 * 
		 * 🔹 BufferedWriter
		 * 
		 * How does BufferedWriter improve write performance?
		 * 
		 * How do you flush data safely to disk?
		 * 
		 * When should you explicitly call flush()?
		 * 
		 * How do you handle concurrent writes to the same file?
		 * 
		 * How do you ensure atomic write operations using BufferedWriter?
		 * 
		 * 🔹 Serializable
		 * 
		 * Why is Serializable used in real-world applications?
		 * 
		 * How do you control which fields are serialized?
		 * 
		 * Why is serialVersionUID important in production systems?
		 * 
		 * How do you prevent sensitive data from being serialized?
		 * 
		 * What are the limitations of Java serialization?
		 * 
		 * 🔹 Deserialization
		 * 
		 * How do you safely deserialize objects from external sources?
		 * 
		 * How do you handle class version mismatch during deserialization?
		 * 
		 * What security risks exist with deserialization?
		 * 
		 * How do you validate object data after deserialization?
		 * 
		 * How do you handle corrupted serialized files?
		 */

		// How do you validate a file’s existence, permissions, and path before
		// processing it?
		/*
		 * File file = new
		 * File("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\1.txt");
		 * 
		 * if(file.exists()) { System.out.println(file+" is exists.");
		 * if(file.canExecute()) { System.out.println(file+" can execute.");
		 * if(file.canRead()) { System.out.println(file+" can read.");
		 * if(file.canWrite()) { System.out.println(file+" can write.");
		 * if(file.getPath() != null) { System.out.println(file.getPath()); } } } } }
		 */

		// How would you safely create directory structures if they do not exist?
		// File file = new
		// File("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\1.txt");

		// How do you handle OS-dependent file paths in production systems?
		/*
		 * Path path =
		 * Paths.get("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\1.txt");
		 * System.out.println(path);
		 */

		// How do you list and filter files in a directory based on extension?
		// list() -- return only current folder file not sub folder file
		// walk() -- all
		/*
		 * Path dir = Paths.get("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads");
		 * try(Stream<Path> paths = Files.list(dir)){ paths
		 * .filter(Files::isRegularFile) .filter(path ->
		 * path.toString().endsWith(".txt")) .forEach(System.out::println); }
		 */

		// How do you handle symbolic links and invalid paths?
		/*
		 * try { Path path =
		 * Paths.get("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\1.txt").
		 * normalize();
		 * 
		 * // Check if path exists if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
		 * System.out.println("Invalid or missing path."); return; }
		 * 
		 * // Check if symbolic link if (Files.isSymbolicLink(path)) {
		 * System.out.println("Path is a symbolic link. Not following it for security."
		 * ); return; }
		 * 
		 * // Check if regular file (without following links) if
		 * (Files.isRegularFile(path, LinkOption.NOFOLLOW_LINKS)) {
		 * System.out.println("Valid regular file: " + path.toAbsolutePath()); } else {
		 * System.out.println("Not a regular file."); }
		 * 
		 * } catch (InvalidPathException e) {
		 * System.out.println("Invalid path format."); }
		 */

		/*
		 * How do you write text data to a file while ensuring data consistency?
		 * 
		 * How would you append data to a file without overwriting existing content?
		 * 
		 * How do you handle partial writes when an exception occurs?
		 * 
		 * Why is FileWriter not recommended for high-performance systems?
		 * 
		 * How do you ensure character encoding correctness when using FileWriter?
		 */

		/*
		 * File tempFile = new
		 * File("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\tempFile.txt"); File
		 * realFile = new
		 * File("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\mainFile.txt");
		 * 
		 * String data = "new data added at"+System.currentTimeMillis();
		 * 
		 * try {
		 * 
		 * FileWriter tempWriter = new FileWriter(tempFile); tempWriter.write(data);
		 * tempWriter.flush(); tempWriter.close();
		 * 
		 * if(realFile.exists()) { realFile.delete(); }
		 * 
		 * tempFile.renameTo(realFile);
		 * 
		 * FileWriter appendWriter = new FileWriter(realFile , true);
		 * appendWriter.write("new data appended\n"); appendWriter.close();
		 * 
		 * System.out.println("Written done successfully.");
		 * 
		 * }catch(IOException ex) { ex.printStackTrace(); }
		 */

		/*
		 * How do you read text files safely using FileReader?
		 * 
		 * Why is FileReader unsuitable for large files in production?
		 * 
		 * How do you handle FileNotFoundException using FileReader?
		 * 
		 * How do you detect end-of-file while reading characters?
		 * 
		 * How do you handle encoding mismatches while reading files?
		 */

		/*
		 * File file = new
		 * File("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\mainFile.txt");
		 * FileReader fileReader = null;
		 * 
		 * try {
		 * 
		 * fileReader = new FileReader(file);
		 * 
		 * int character;
		 * 
		 * while((character = fileReader.read()) != -1) {
		 * System.out.print((char)character); }
		 * 
		 * }catch(FileNotFoundException ex) {
		 * System.out.println("File is not found exception : "+ex.getMessage());
		 * }catch(IOException ex) {
		 * System.out.println("Error occur during reading of file :"+ex.getMessage());
		 * }finally { if(fileReader != null) { try { fileReader.close(); } catch
		 * (IOException e) { System.out.println("Error occur while closing a file."); }
		 * } }
		 */

		/*
		 * How does BufferedWriter improve write performance?
		 * 
		 * How do you flush data safely to disk?
		 * 
		 * When should you explicitly call flush()?
		 * 
		 * How do you handle concurrent writes to the same file?
		 * 
		 * How do you ensure atomic write operations using BufferedWriter?
		 */

		/*
		 * File mainFile = new
		 * File("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\mainFile.txt"); File
		 * tempFile = new
		 * File("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\tempFile.txt");
		 * 
		 * String data = "New entry at " + System.currentTimeMillis() + "\n";
		 * 
		 * synchronized (lock) { // 4️⃣ handle concurrent writes
		 * 
		 * try {
		 * 
		 * // 5️⃣ Atomic write: write to temp file first BufferedWriter writer = new
		 * BufferedWriter(new FileWriter(tempFile));
		 * 
		 * writer.write(data);
		 * 
		 * // 2️⃣ Flush safely to OS buffer writer.flush();
		 * 
		 * writer.close();
		 * 
		 * // Replace original file (atomic-like behavior) if (mainFile.exists()) {
		 * mainFile.delete(); } tempFile.renameTo(mainFile);
		 * 
		 * System.out.println("Write successful.");
		 * 
		 * } catch (IOException e) { System.out.println("Write failed: " +
		 * e.getMessage()); } }
		 */

		/*
		 * Why is BufferedReader preferred over FileReader in enterprise applications?
		 * 
		 * How do you read large files line-by-line efficiently?
		 * 
		 * How would you skip header lines in a CSV file using BufferedReader?
		 * 
		 * How do you handle malformed lines during file processing?
		 * 
		 * How do you ensure proper resource management when using BufferedReader?
		 */

		/*
		 * BufferedReader reader = null;
		 * 
		 * try {
		 * 
		 * // 5️⃣ Proper resource handling (manual close in finally) reader = new
		 * BufferedReader(new
		 * FileReader("C:\\Users\\wwwab\\Desktop\\java\\simple\\uploads\\data.csv"));
		 * 
		 * String line;
		 * 
		 * // 3️⃣ Skip header line (CSV first row) reader.readLine(); // skip header
		 * 
		 * // 2️⃣ Read large file line-by-line efficiently while ((line =
		 * reader.readLine()) != null) {
		 * 
		 * try { // 4️⃣ Handle malformed lines String[] parts = line.split(",");
		 * 
		 * if (parts.length < 3) { System.out.println("Malformed line skipped: " +
		 * line); continue; }
		 * 
		 * // Process valid line System.out.println("Name: " + parts[0] + ", Age: " +
		 * parts[1] + ", City: " + parts[2]);
		 * 
		 * } catch (Exception e) { System.out.println("Error processing line: " + line);
		 * } }
		 * 
		 * System.out.println("File processed successfully.");
		 * 
		 * } catch (IOException e) { System.out.println("File error: " +
		 * e.getMessage()); } finally { try { if (reader != null) { reader.close(); //
		 * ensure resource closed } } catch (IOException e) {
		 * System.out.println("Error closing file."); } }
		 */

		/*
		 * Why is Serializable used in real-world applications?
		 * 
		 * How do you control which fields are serialized?
		 * 
		 * Why is serialVersionUID important in production systems?
		 * 
		 * How do you prevent sensitive data from being serialized?
		 * 
		 * What are the limitations of Java serialization?
		 */

		/*
		 * 1️⃣ Why is Serializable used in real-world applications?
		 * 
		 * Serializable is used to convert an object into byte stream so it can be:
		 * 
		 * Stored in a file
		 * 
		 * Sent over network
		 * 
		 * Saved in cache (Redis, session replication)
		 * 
		 * Used in RMI
		 * 
		 * Stored in HTTP session (in distributed systems)
		 * 
		 * Example real-world:
		 * 
		 * E-commerce app → User session stored in server cluster
		 * 
		 * Microservices → Object transferred between services
		 */

		/*
		 * ✅ 2️⃣ How do you control which fields are serialized? 🔹 Option 1: Use
		 * transient class User implements Serializable { String name; transient String
		 * password; // will NOT be serialized } transient fields are ignored during
		 * serialization.
		 * 
		 * 🔹 Option 2: Custom Serialization Override: private void
		 * writeObject(ObjectOutputStream oos) throws IOException private void
		 * readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException
		 * This gives full control.
		 */

		/*
		 * 3️⃣ Why is serialVersionUID Important in Production? private static final
		 * long serialVersionUID = 1L;
		 * 
		 * It ensures version compatibility.
		 * 
		 * If class structure changes: Without serialVersionUID → InvalidClassException
		 * With fixed serialVersionUID → controlled compatibility
		 * 
		 * In production systems: Prevents crashes after deployment Maintains backward
		 * compatibility
		 */

		/*
		 * 4️⃣ How do you prevent sensitive data from being serialized? ✔ Use transient
		 * transient String password;
		 * 
		 * ✔ Or encrypt before serialization ✔ Or custom writeObject() method
		 * 
		 * Example: private void writeObject(ObjectOutputStream oos) throws IOException
		 * { oos.defaultWriteObject(); // serialize normal fields } Sensitive fields
		 * excluded.
		 */

		/*
		 * 5️⃣ Limitations of Java Serialization 🚫 Slow performance 🚫 Large byte size
		 * 🚫 Security risks (deserialization attacks) 🚫 Not language-independent 🚫
		 * Breaks easily if class structure changes 🚫 Difficult version management
		 * 
		 * That’s why modern systems prefer: JSON XML Protocol Buffers
		 */

		/*
		 * User user = new User("Abubakar", "Secret123", 24);
		 * 
		 * // 🔹 Serialize object try { ObjectOutputStream oos = new
		 * ObjectOutputStream(new FileOutputStream("user.ser"));
		 * 
		 * oos.writeObject(user); oos.close();
		 * 
		 * System.out.println("Object Serialized Successfully");
		 * 
		 * } catch (IOException e) { System.out.println("Serialization Error: " +
		 * e.getMessage()); }
		 */

		/*
		 * How do you safely deserialize objects from external sources?
		 * 
		 * How do you handle class version mismatch during deserialization?
		 * 
		 * What security risks exist with deserialization?
		 * 
		 * How do you validate object data after deserialization?
		 * 
		 * How do you handle corrupted serialized files?
		 */

		/*
		 * ✅ 1️⃣ How to Safely Deserialize Objects from External Sources?
		 * 
		 * Never blindly deserialize.
		 * 
		 * Safe steps:
		 * 
		 * Restrict allowed classes
		 * 
		 * Validate object after reading
		 * 
		 * Handle exceptions properly
		 * 
		 * Never deserialize untrusted internet data directly
		 * 
		 * ✅ 2️⃣ Handle Class Version Mismatch
		 * 
		 * If serialVersionUID changes → InvalidClassException.
		 * 
		 * Solution:
		 * 
		 * private static final long serialVersionUID = 1L;
		 * 
		 * 
		 * Keep it fixed for compatible versions.
		 * 
		 * ✅ 3️⃣ Security Risks in Deserialization
		 * 
		 * 🚨 Major risks:
		 * 
		 * Remote Code Execution (RCE)
		 * 
		 * Gadget chain attacks
		 * 
		 * Malicious object injection
		 * 
		 * DoS (huge object graph)
		 * 
		 * That’s why deserialization is considered dangerous in enterprise systems.
		 * 
		 * ✅ 4️⃣ Validate Object After Deserialization
		 * 
		 * After reading object:
		 * 
		 * Check null values
		 * 
		 * Validate ranges
		 * 
		 * Validate required fields
		 * 
		 * Throw exception if invalid
		 * 
		 * Never trust deserialized data.
		 * 
		 * ✅ 5️⃣ Handle Corrupted Serialized Files
		 * 
		 * Catch:
		 * 
		 * StreamCorruptedException
		 * 
		 * EOFException
		 * 
		 * InvalidClassException
		 * 
		 * IOException
		 * 
		 * Gracefully handle errors.
		 */

		// 🔹 STEP 1: Serialize object
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {

			User2 user = new User2("Abubakar", 24);
			User2 user2 = new User2("Abubakar", 27);
			User2 user3 = new User2("Abubakar", 89);
			oos.writeObject(user);
			oos.writeObject(user2);
			oos.writeObject(user3);
			System.out.println("Object Serialized Successfully");

		} catch (IOException e) {
			System.out.println("Serialization error: " + e.getMessage());
		}

		// 🔹 STEP 2: Deserialize object safely
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {

			while (true) {
				try {
					Object obj = ois.readObject();

					if (!(obj instanceof User2)) {
						throw new SecurityException("Unauthorized class detected");
					}

					User2 user = (User2) obj;

					if (!user.isValid()) {
						throw new IllegalArgumentException("Invalid object data");
					}

					System.out.println("Safe object loaded: " + user);

				} catch (EOFException e) {
					// End of file reached
					System.out.println("End of file.");
					break; // break loop safely
				}
			}

		} catch (InvalidClassException e) {
			System.out.println("Class version mismatch: " + e.getMessage());

		} catch (StreamCorruptedException e) {
			System.out.println("Corrupted file detected.");

		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Deserialization error: " + e.getMessage());

		} catch (SecurityException e) {
			System.out.println("Security violation: " + e.getMessage());
		}

	}

}

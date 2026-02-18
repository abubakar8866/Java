package java8Feature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class Base64Que {

	public static void main(String[] args) throws IOException {
		
		/*
		Encode a password before storing it and decode it while login verification.

		Encode an image file into Base64 string and decode it back to file.

		Generate a Basic Auth header (username:password) using Base64 encoding.
		*/
		
		//Encode Password & Decode During Login
		// Password entered during registration
		/*
		 * String password = "mySecret123";
		 * 
		 * // Encode before storing String encoded = Base64.getEncoder()
		 * .encodeToString(password.getBytes());
		 * 
		 * System.out.println("Encoded: " + encoded);
		 * 
		 * // ---- Login Phase ----
		 * 
		 * // Password entered during login String inputPassword = "mySecret123";
		 * 
		 * // Decode stored password String decodedStoredPassword = new String(
		 * Base64.getDecoder().decode(encoded) );
		 * 
		 * // Compare if (inputPassword.equals(decodedStoredPassword)) {
		 * System.out.println("Login Successful"); } else {
		 * System.out.println("Invalid Credentials"); }
		 */
		
		//Encode an image file into Base64 string and decode it back to file.
		/*
		 * byte[] imageBytes = Files.readAllBytes(Path.of("image.jpg"));
		 * 
		 * String base64Image = Base64.getEncoder() .encodeToString(imageBytes);
		 * 
		 * System.out.println(base64Image);
		 * 
		 * byte[] decodedBytes = Base64.getDecoder() .decode(base64Image);
		 * 
		 * Files.write(Path.of("decoded_image.jpg"), decodedBytes);
		 */

		//Generate a Basic Auth header (username:password) using Base64 encoding.
		/*
		 * String username = "admin"; String password = "1234";
		 * 
		 * String auth = username + ":" + password;
		 * 
		 * String encodedAuth = Base64.getEncoder() .encodeToString(auth.getBytes());
		 * 
		 * String header = "Basic " + encodedAuth;
		 * 
		 * System.out.println(header);
		 */


	}

}

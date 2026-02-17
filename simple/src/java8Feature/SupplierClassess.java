package java8Feature;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierClassess {

	public static void main(String[] args) {
		//give output, not take any value.
		
		/*
		 * Supplier<Double> supp = () -> { return Math.random(); };
		 */
		
		/*
		 * Supplier<Double> supp = () -> Math.random();
		 * 
		 * System.out.println(supp.get());
		 */
		
		/*
		Generate random OTP using Supplier<String>.
		Generate random number using Supplier<Integer>.		
		Provide default user object using Supplier<User>.		
		Generate current timestamp using Supplier<LocalDateTime>.		
		Create a unique order ID generator using Supplier<String>.
		*/
		
		//Generate random OTP using Supplier<String>.
		/*
		 * Supplier<String> otpSupplier = () -> { Random random = new Random(); int otp
		 * = 100000 + random.nextInt(900000); // 6-digit OTP return String.valueOf(otp);
		 * }; System.out.println("OTP: " + otpSupplier.get());
		 */
		
		//Generate random number using Supplier<Integer>.
		/*
		 * Supplier<Integer> randomNumber = () -> { Random random = new Random(); return
		 * 10000 + random.nextInt(10000); // 0 to 9999 };
		 * System.out.println("Random Number: " + randomNumber.get());
		 */
        
        //Provide default user object using Supplier<User>.
		/*
		 * Supplier<User> defaultUser = () -> new User(1, "Guest"); User user =
		 * defaultUser.get(); System.out.println(user.id + " " + user.name);
		 */
		
		//Generate current timestamp using Supplier<LocalDateTime>.
		/*
		 * Supplier<LocalDateTime> timeSupplier = () -> LocalDateTime.now();
		 * System.out.println("Current Time: " + timeSupplier.get());
		 */
		
		//Create a unique order ID generator using Supplier<String>.
		Supplier<String> orderIdSupplier = () ->
        "ORD-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        System.out.println("Order ID: " + orderIdSupplier.get());
        
	}

}

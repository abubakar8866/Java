package java8Feature;

import java.util.Optional;

public class OptionalQue {
	
	public static Optional<User1> findUser(String name){
		if("abu".equals(name)) {
			return Optional.of(new User1("abubakar"));
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		
		/*
		 	Write a method that returns an Optional<User> and print the username if present, else print "User not found".
			Given Optional<String>, return its length if present, otherwise return 0.
			Chain multiple Optionals (User → Address → City) and safely get the city name without NullPointerException.
		 */

		//Write a method that returns an Optional<User> and print the username if present, else print "User not found".
		/*
		 * Optional<User1> userOpt = findUser("abu"); userOpt .map(User1::getUsername)
		 * .ifPresentOrElse( System.out::println, () ->
		 * System.out.println("User not found") );
		 */
		
		//Given Optional<String>, return its length if present, otherwise return 0.
		/*
		 * Optional<String> name = Optional.of("abubakar"); int length = name
		 * .map(String::length) .orElse(0); System.out.println(length);
		 */

		//Chain multiple Optionals (User → Address → City) and safely get the city name without NullPointerException.
		/*
		 * City city = new City("Ahmedabad"); Address address = new Address(city); User3
		 * user3 = new User3(address);
		 * 
		 * Optional<User3> userOpt = Optional.ofNullable(user3);
		 * 
		 * String cityName = userOpt .map(User3::getAddress) .map(Address::getCity)
		 * .map(City::getName) .orElse("City not available");
		 * 
		 * System.out.println(cityName);
		 */
		
	}

}

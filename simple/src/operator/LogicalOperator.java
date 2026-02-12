package operator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//Check whether a number lies between 10 and 50.
		if((10 < 15) && (15<50)) {
			System.out.println("Number is lies between 15 and 50.");
		}else {
			System.out.println("Number is not lies between 15 and 50.");
		}
		
		//Check whether a year is leap year.
		System.out.println(
				(2012 % 4 == 0 && 2012 % 100 != 0) ||
				(2012 % 400 == 0) ?"2012 is leap year"
				:"2012 is not a leap year."
				);

		//Check whether a character is vowel or consonant.
		System.out.print("Enter char = ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("character is vowel.");
		}else {
			System.out.println("character is constant.");
		}
		
		//Check whether a number is divisible by 3 and 5.
		if((15 % 3 == 0) && (15 % 5 == 0)) {
			System.out.println("15 is a number that is divisible by 3 and 5 both.");
		}else {
			System.out.println("15 is not a number that is divisible by 3 and 5 both.");
		}
		
		//Validate username and password.
		if(!Pattern.matches("[a-z]+", "ABU")) {
			System.out.println("Only lowecase is allowed.");
		}
		
		if(Pattern.matches("[a-zA-Z0-9]{8,}", "Abubakarui")) {
			System.out.println("Password must contain digit");
		}
		
	}

}

package java8Feature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateNTime {

	public static void main(String[] args) {
		
		/*
		Calculate the number of days between two given dates.
		Check whether a given year is a leap year using LocalDate.		
		Format current date-time as "dd-MM-yyyy HH:mm:ss".
		*/
		
		//Calculate the number of days between two given dates.
		/*
		 * LocalDate date1 = LocalDate.of(2024, 1, 1); LocalDate date2 =
		 * LocalDate.of(2024, 2, 15); long days = ChronoUnit.DAYS.between(date1, date2);
		 * System.out.println("Days between: " + days);
		 */
		
		//Check whether a given year is a leap year using LocalDate.
		/*
		 * int year = 2024; boolean isLeap = LocalDate.of(year, 1, 1).isLeapYear();
		 * System.out.println("Is Leap Year: " + isLeap);
		 */
		
		//Format current date-time as "dd-MM-yyyy HH:mm:ss".
		/*
		 * LocalDateTime now = LocalDateTime.now(); DateTimeFormatter formatter =
		 * DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); String formatted =
		 * now.format(formatter); System.out.println(formatted);
		 */

	}

}

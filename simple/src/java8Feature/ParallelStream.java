package java8Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ParallelStream {
	
	public static boolean isPrime(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }

	public static void main(String[] args) {
		
		/*
		Calculate sum of 1 to 1,000,000 using sequential stream and parallel stream — compare performance.
		Convert a list of 10,000 strings to uppercase using parallel stream.		
		Find maximum number from a large list using parallel stream.		
		Demonstrate a problem using parallel stream with non-thread-safe collection.		
		Count prime numbers between 1 to 1,00,000 using parallel stream.
		*/
		
		//Calculate sum of 1 to 1,000,000 using sequential stream and parallel stream — compare performance.
		/*
		 * long start = System.currentTimeMillis(); long sum1 =
		 * LongStream.rangeClosed(1, 1_00_0000) .sum(); long end =
		 * System.currentTimeMillis(); System.out.println("Sequential Sum: " + sum1);
		 * System.out.println("Sequential Time: " + (end - start) + " ms");
		 * 
		 * start = System.currentTimeMillis(); long sum2 = LongStream.rangeClosed(1,
		 * 1_00_0000) .parallel() .sum(); end = System.currentTimeMillis();
		 * System.out.println("Parallel Sum: " + sum2);
		 * System.out.println("Parallel Time: " + (end - start) + " ms");
		 */
		
		//Convert a list of 10,000 strings to uppercase using parallel stream.
		/*
		 * List<String> list = IntStream.range(0, 10_000) .mapToObj(i -> "java" + i)
		 * .toList(); List<String> upper = list.parallelStream()
		 * .map(String::toUpperCase) .toList(); System.out.println(upper);
		 */
		
		//Find maximum number from a large list using parallel stream.
		/*
		 * List<Integer> numbers = IntStream.range(1, 1_000_000) .boxed() .toList(); int
		 * max = numbers.parallelStream() .max(Integer::compareTo) .orElseThrow();
		 * System.out.println("Max: " + max);
		 */

		//Demonstrate a problem using parallel stream with non-thread-safe collection.
		//⚠ Wrong Example
		/*List<Integer> list = new ArrayList<>();

		IntStream.range(1, 10_000)
		        .parallel()
		        .forEach(list::add);*/

		/*💥 Problem
		ArrayList is NOT thread-safe.
		Can cause:
		Data corruption
		Missing elements
		ArrayIndexOutOfBoundsException

		✅ Correct Version*/
		/*
		 * List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		 * 
		 * IntStream.range(1, 10_000) .parallel() .forEach(list::add);
		 * 
		 * 
		 * //OR better:
		 * 
		 * List<Integer> list = IntStream.range(1, 10_000) .parallel() .boxed()
		 * .toList();
		 */
		
		//Count prime numbers between 1 to 1,00,000 using parallel stream.
		long count = IntStream.rangeClosed(1, 100_000)
                .parallel()
                .filter(ParallelStream::isPrime)
                .count();
        System.out.println("Total Primes: " + count);
		
	}

}

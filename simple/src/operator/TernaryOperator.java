package operator;

public class TernaryOperator {

	public static void main(String[] args) {
		
		//Find largest of two numbers using ternary operator.
		System.out.println((67>56) ? "67 is greater than 56 number." : "56 is grether than 67 number.");
		
		//Check whether a number is even or odd.
		System.out.println((67%2==0) ? "67 is even number" : "67 is odd number.");
		
		//Find smallest of three numbers.
		int a = 3;
		int b = 4;
		int c = 5;
		
		int smallest = (a < b)
					? (a< c ? a : c)
					: (b < c ? b : c);
		System.out.println(smallest);
		
		//Check pass or fail using ternary operator.
		int marks = 98;
		System.out.println((marks > 35) ? "you are pass." : "you are fail.");
		
		
		
	}

}

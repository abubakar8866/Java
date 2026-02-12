package operator;

public class BitwiseOperatorQue {

	public static void main(String[] args) {
		
		//Find output of:
		System.out.println(5 & 3);
		
		//Swap two numbers using XOR (^).
		int a = 1;
		int b = 5;
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println(a+" "+b);
		
		//Left shift and right shift example.
		int n = 10;
		
		System.out.println(n << 3);
		System.out.println(n >> 3);
		
		int p = -10;
		System.out.println(p >>> 4);
		
		//Difference between logical AND (&&) and bitwise AND (&)
		
		int c = 5;
		int d = 3;
		
		System.out.println((c > d && c != 0) ? "c is greater than d and not equal to 0." : "d is greater than c and not equal to 0");
		
		System.out.println(c & 3);
		
	}

}
